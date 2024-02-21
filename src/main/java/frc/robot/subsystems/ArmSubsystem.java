package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ArmSubsystem extends SubsystemBase {
    public ArmSubsystem() {
        this.ARM_MOTOR_1_PORT = new CANSparkMax(PortConstraints.CLAW_ROTATE_PORT, MotorType.kBrushless);
        this.ARM_MOTOR_2_PORT = new CANSparkMax(PortConstraints.CLAW_ROTATE_PORT, MotorType.kBrushless);
        public void setSpeedMotor1(double speed) {
            this.ARM_MOTOR_1_PORT.set(speed);
        }
        public void setSpeedMotor2(double speed) {
            this.ARM_MOTOR_2_PORT.set(speed);
        }
        public void setSpeedBoth(double speed1, double speed2) {
            this.ARM_MOTOR_1_PORT.set(speed1);
            this.ARM_MOTOR_2_PORT.set(speed2);
        }
    }


}