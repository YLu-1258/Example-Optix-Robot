package frc.robot.subsystems;

import java.util.ArrayList;
import com.ctre.phoenix.motorcontrol.can.*;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.motorcontrol.MotorController;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;

public class Shooter {
    private WPI_TalonFX right_shooter_motor = new WPI_TalonFX(15);
    private WPI_TalonFX left_shooter_motor = new WPI_TalonFX(16);

    private MotorControllerGroup shooter = new MotorControllerGroup(left_shooter_motor, right_shooter_motor);

    public Shooter() {
        left_shooter_motor.setInverted(true);
        right_shooter_motor.setInverted(false);
    }
    public void setShooter(double speed) {
        shooter.set(speed);
    }
}
