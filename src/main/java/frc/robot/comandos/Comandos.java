 package frc.robot.comandos;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Subsystem;



public class  Comandos extends Command{

    public final Subsystem bala;

    public Comandos (Subsystem subsystem){
        bala = subsystem;
        addRequirements(bala);
        
    }
    

    @Override
    public void initialize(){
    
    }

    @Override
    public void execute(){
        
    }

    @Override
    public void end (boolean interrupted){

    }
    
}