package frc.robot.subsystem;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj.motorcontrol.MotorController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Shooter extends SubsystemBase {
    public CANSparkMax spark1 = new CANSparkMax(5, MotorType.kBrushed);
    public CANSparkMax spark2 = new CANSparkMax(6, MotorType.kBrushed);
    public MotorController shooterMotor1 = spark1;
    public MotorController shooterMotor2 = spark2;
    

    public void atirar(){
        shooterMotor1.set(-1);
        shooterMotor2.set(1);
    }
    public void stop(){
        shooterMotor1.set(0);
        shooterMotor2.set(0);
    }

    @Override
    public void periodic(){
        shooterMotor1.set(-0.3);
        shooterMotor2.set(0.3);
    }

    @Override
    public void simulationPeriodic(){}

    

    
}