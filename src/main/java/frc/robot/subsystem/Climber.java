package frc.robot.subsystem;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkBase.IdleMode;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Climber extends SubsystemBase {

    public CANSparkMax leftClimber = new CANSparkMax(9, MotorType.kBrushed);
    public CANSparkMax rightClimber = new CANSparkMax(10, MotorType.kBrushed);

    public Climber(){
        
        leftClimber.setIdleMode(IdleMode.kBrake);
        rightClimber.setIdleMode(IdleMode.kBrake);
    }

    public void leftUp(){
        leftClimber.set(-1);
    }

    public void leftDown(){
        leftClimber.set(1);
    }
    
    public void leftStop(){
        leftClimber.set(0);
    }

    public void rightUp(){
        rightClimber.set(-1);
    }

    public void rightDown(){
        rightClimber.set(1);
    }

    public void rightStop(){
        rightClimber.set(0);
    }

    
}
