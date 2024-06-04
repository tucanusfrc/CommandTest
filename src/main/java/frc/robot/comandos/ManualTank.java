package frc.robot.comandos;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystem.TankDrive;

public class ManualTank extends Command {

    public TankDrive manualDrive;
    DoubleSupplier left;
    DoubleSupplier right;
    DoubleSupplier front;
    DoubleSupplier back;


    public ManualTank (TankDrive tankDrive,
    DoubleSupplier leftY, DoubleSupplier rightY,
    DoubleSupplier frente, DoubleSupplier tras){
        front = frente;
        back = tras;
        left = leftY;
        right = rightY;

        manualDrive = tankDrive;
        addRequirements(manualDrive);

    }

    @Override
    public void initialize(){
        manualDrive.drivemanual(left.getAsDouble(), right.getAsDouble(), front.getAsDouble(), back.getAsDouble());
    }

    @Override
    public void execute(){
        manualDrive.drivemanual(left.getAsDouble(), right.getAsDouble(), front.getAsDouble(), back.getAsDouble());
    }

    @Override
    public void end (boolean interrupted){
        manualDrive.drivemanual(0, 0, 0, 0);
    }
}
