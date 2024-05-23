package frc.robot.subsystem;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj.motorcontrol.MotorController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Subsystem extends SubsystemBase {
    public CANSparkMax sparkito = new CANSparkMax(5, MotorType.kBrushed);
    public MotorController spark = sparkito;
    public Subsystem(){}

    public boolean condicao(){
        return (false);
    }

    @Override
    public void periodic(){}

    @Override
    public void simulationPeriodic(){}

    
}