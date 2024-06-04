package frc.robot.comandos.Climber;


import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystem.Climber;

public class RightDown extends Command {

    private Climber arms;

    public RightDown(Climber climber){
        arms = climber;
    }

    @Override
    public void initialize(){
        arms.leftStop();
        arms.rightStop();
    }

    @Override
    public void execute(){
        arms.leftStop();
        arms.rightDown();
    }

    @Override
    public void end (boolean interrupted){
        arms.leftStop();
        arms.rightStop();
    }
}
