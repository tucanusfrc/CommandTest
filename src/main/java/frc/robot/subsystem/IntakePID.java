package frc.robot.subsystem;

import com.revrobotics.CANSparkMax;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.SparkPIDController;
import com.revrobotics.CANSparkBase.ControlType;
import com.revrobotics.CANSparkBase.IdleMode;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.OperatorConstants;

public class IntakePID extends SubsystemBase{

    public CANSparkMax moveIntake = new CANSparkMax(7, MotorType.kBrushless);
    private RelativeEncoder encoder = moveIntake.getEncoder();
    public SparkPIDController pid;

    public void intakeMove(double reference){
        
        moveIntake.setIdleMode(IdleMode.kCoast);
        pid = moveIntake.getPIDController();

        pid.setP(OperatorConstants.p);
        pid.setI(OperatorConstants.i);
        pid.setD(OperatorConstants.d);
        pid.setIZone(OperatorConstants.iz);
        pid.setFF(OperatorConstants.ff);
        pid.setOutputRange(OperatorConstants.min , OperatorConstants.max);

        pid.setReference(reference, ControlType.kPosition);
    }

    public void motorSet(double speed){
        moveIntake.set(speed);
    }

    public void setZero(){
        encoder.setPosition(0);
    }

    public void intakeOut(){
        intakeMove(-45);
    }
    
    public void intakeIn(){
        intakeMove(0);
    }
}
