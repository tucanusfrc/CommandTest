package frc.robot.comandos;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystem.IntakePID;

public class ResetIntake extends Command {

    IntakePID intake;

    public ResetIntake(IntakePID intakePID){
        intake = intakePID;
        addRequirements(intake);
    }
    
    @Override
    public void initialize(){
        intake.motorSet(-0.02);
    }

    @Override
    public void execute(){
        intake.motorSet(-0.05);
    }

    @Override
    public void end (boolean interrupted){
        intake.setZero();
    }

}
