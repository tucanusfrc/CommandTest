package frc.robot.comandos;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystem.GetIntake;

public class IntakeOut extends Command {
    
    private GetIntake itk;

    public IntakeOut (GetIntake intake){
        itk = intake;
    }
    
    @Override
    public void initialize(){
        itk.drop();
    }

    @Override
    public void execute(){
        itk.drop();
    }

    @Override
    public void end (boolean interrupted){
        itk.stop();
    }
}
