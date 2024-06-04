package frc.robot.comandos.Climber;


import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystem.Climber;

public class DuoDown extends Command {

    private Climber arms;

    public DuoDown(Climber climber){
        arms = climber;
    }

    @Override
    public void initialize(){
        arms.leftStop();
        arms.rightStop();
    }

    @Override
    public void execute(){
        arms.leftDown();
        arms.rightUp();
    }

    @Override
    public void end (boolean interrupted){
        arms.leftStop();
        arms.rightStop();
    }
}
