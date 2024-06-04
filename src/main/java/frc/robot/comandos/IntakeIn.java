package frc.robot.comandos;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystem.GetIntake;

public class IntakeIn extends Command{

    private GetIntake itk;

    public IntakeIn (GetIntake intake){
        itk = intake;
    }
    
    @Override
    public void initialize(){
        itk.get();
    }

    @Override
    public void execute(){
        itk.get();
    }

    @Override
    public void end (boolean interrupted){
        itk.stop();
    }

}
