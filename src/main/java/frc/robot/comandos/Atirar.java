 package frc.robot.comandos;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystem.Shooter;

public class  Atirar extends Command{

    public Shooter shooter; 

    public Atirar (Shooter subsystem){
        shooter = subsystem;
        addRequirements(); 
    }
    

    @Override
    public void initialize(){
        shooter.atirar();
    }

    @Override
    public void execute(){
        shooter.atirar();
    }

    @Override
    public void end (boolean interrupted){
        shooter.stop();
    }
    
}