package frc.robot.comandos.Climber;


import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystem.Climber;

public class LeftUp extends Command {

    private Climber arms;

    public LeftUp(Climber climber){
        arms = climber;
    }

    @Override
    public void initialize(){
        arms.leftStop();
        arms.rightStop();
    }

    @Override
    public void execute(){
        arms.leftUp();
        arms.rightStop();
    }

    @Override
    public void end (boolean interrupted){
        arms.leftStop();
        arms.rightStop();
    }
}
