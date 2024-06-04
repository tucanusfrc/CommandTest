package frc.robot.comandos;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystem.IntakePID;

public class PositioIntake extends Command {

    private boolean position = false;
    private double reference;
    IntakePID intake;

    public PositioIntake(IntakePID intakePID){
        intake = intakePID;
        addRequirements(intake);
    }

    @Override
    public void initialize(){
        position = !position;
    }

    @Override
    public void execute(){
        if (position) {reference = -45;}
        else{reference = 0;}
        intake.intakeMove(reference);
    }

    @Override
    public void end (boolean interrupted){
        intake.intakeMove(reference);
    }
}
