package frc.robot.subsystem;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class TankDrive extends SubsystemBase{
    
    private CANSparkMax spark1 = new CANSparkMax(3, MotorType.kBrushless);
    private CANSparkMax spark2 = new CANSparkMax(4, MotorType.kBrushless);
    private CANSparkMax spark3 = new CANSparkMax(1, MotorType.kBrushless);
    private CANSparkMax spark4 = new CANSparkMax(2, MotorType.kBrushless);

    private boolean flag = false;


    public void drivemanual(double left, double right, double front, double back){
        spark2.follow(spark1);
        spark4.follow(spark3);

        if (front > 0.1 || back > 0.1){
            if(front>back){
                spark1.set(front);
                spark3.set(front);
            } else{
                spark1.set(-back);
                spark3.set(-back);
            }
        }else{
            if (left > 0.1 || left < -0.1 || right > 0.1 || right < -0.1) {
                spark1.set(-left * 0.2);
                spark3.set(-right * 0.2);
            } else{
                spark1.set(0);
                spark3.set(0);
            }
        }
    }

    public void drivefront(){
        spark1.set(1);
        spark3.set(1);
    }

    public void driveback(){
        spark1.set(-1);
        spark3.set(-1);
    }

    public void drivestop(){
        spark1.set(0);
        spark3.set(0);
    }



}
