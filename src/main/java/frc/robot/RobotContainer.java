// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.Trigger;
import frc.robot.comandos.Atirar;
import frc.robot.comandos.IntakeIn;
import frc.robot.comandos.IntakeOut;
import frc.robot.comandos.ManualTank;
import frc.robot.comandos.PositioIntake;
import frc.robot.comandos.PositionAMP;
import frc.robot.comandos.ResetIntake;
import frc.robot.comandos.Climber.DuoDown;
import frc.robot.comandos.Climber.DuoUp;
import frc.robot.comandos.Climber.LeftDown;
import frc.robot.comandos.Climber.LeftUp;
import frc.robot.comandos.Climber.RightDown;
import frc.robot.comandos.Climber.RightUp;
import frc.robot.subsystem.Climber;
import frc.robot.subsystem.GetIntake;
import frc.robot.subsystem.IntakePID;
import frc.robot.subsystem.Shooter;
import frc.robot.subsystem.TankDrive;

public class RobotContainer {

  public CommandXboxController drive = new  CommandXboxController(0);
  public CommandXboxController guitarra = new  CommandXboxController(1);
  public XboxController controller = new XboxController(0);
  public final Shooter atirar = new Shooter();
  public IntakePID intakePosition = new IntakePID();
  public TankDrive tkdrive = new TankDrive();
  public GetIntake intake = new GetIntake();
  public Climber climb = new Climber();

  public boolean climbGuitarra = guitarra.leftBumper().getAsBoolean();

  public RobotContainer() {
    configureBindings();
  }

  private void configureBindings() {
    
    new Trigger(guitarra.leftBumper()).and(guitarra.leftStick().negate()).whileTrue(new Atirar(atirar));
    new Trigger(guitarra.a()).and(guitarra.leftStick().negate()).whileTrue(new PositioIntake(intakePosition));
    new Trigger(guitarra.b()).and(guitarra.leftStick().negate()).whileTrue(new PositionAMP(intakePosition));
    new Trigger(guitarra.y()).and(guitarra.leftStick().negate()).whileTrue(new IntakeIn(intake));
    new Trigger(guitarra.x()).and(guitarra.leftStick().negate()).whileTrue(new IntakeOut(intake));

    new Trigger(guitarra.a().and(guitarra.leftStick())).whileTrue(new LeftUp(climb));
    new Trigger(guitarra.b().and(guitarra.leftStick())).whileTrue(new LeftDown(climb));
    new Trigger(guitarra.y().and(guitarra.leftStick())).whileTrue(new RightUp(climb));
    new Trigger(guitarra.x().and(guitarra.leftStick())).whileTrue(new RightDown(climb));
    new Trigger(guitarra.x().and(guitarra.leftStick()).and(guitarra.a())).whileTrue(new DuoUp(climb));
    new Trigger(guitarra.b().and(guitarra.leftStick()).and(guitarra.y())).whileTrue(new DuoDown(climb));

    tkdrive.setDefaultCommand(
      new ManualTank(tkdrive,
       drive::getLeftY, drive::getRightY,
       drive::getRightTriggerAxis, drive::getLeftTriggerAxis)
      );
    


  }

  public Command getAutonomousCommand() {
    return Commands.print("No autonomous command configured");
  }
}
