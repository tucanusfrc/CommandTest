package frc.robot.subsystem;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class GetIntake extends SubsystemBase{

    public CANSparkMax intake = new CANSparkMax(8, MotorType.kBrushless);

    public void get(){
        intake.set(1);
    }
    
    public void drop(){
        intake.set(-0.5);
    }

    public void stop(){
        intake.set(0);
    }
}
