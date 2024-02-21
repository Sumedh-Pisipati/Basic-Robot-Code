package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import frc.robot.Constants.OperatorConstants;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ArmSubsystem extends SubsystemBase {
    private static CANSparkMax armMotor1;
    private static CANSparkMax armMotor2;
    public ArmSubsystem() {
        armMotor1 = new CANSparkMax(OperatorConstants.ARM_MOTOR_1_PORT, MotorType.kBrushless);
        armMotor2 = new CANSparkMax(OperatorConstants.ARM_MOTOR_2_PORT, MotorType.kBrushless);
    }
        public static void setSpeedMotor1(double speed){
            armMotor1.set(speed);
        }
        public static void setSpeedMotor2(double speed) {
            armMotor2.set(speed);
        }
        public void setSpeedBoth(double speed1, double speed2) {
            armMotor1.set(speed1);
            armMotor2.set(speed2);
        }
        public static void stopAllMotors() {
            setSpeedMotor1(0);
            setSpeedMotor2(0);
        }
    }