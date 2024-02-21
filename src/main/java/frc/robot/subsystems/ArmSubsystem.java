package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import frc.robot.Constants.OperatorConstants;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ArmSubsystem extends SubsystemBase {
    private CANSparkMax armMotor1;
    private CANSparkMax armMotor2;
    public ArmSubsystem() {
        armMotor1 = new CANSparkMax(OperatorConstants.ARM_MOTOR_1_PORT, MotorType.kBrushless);
        armMotor2 = new CANSparkMax(OperatorConstants.ARM_MOTOR_2_PORT, MotorType.kBrushless);
    }
        public void setSpeedMotor1(double speed){
            this.armMotor1.set(speed);
        }
        public void setSpeedMotor2(double speed) {
            this.armMotor2.set(speed);
        }
        public void setSpeedBoth(double speed1, double speed2) {
            this.armMotor1.set(speed1);
            this.armMotor2.set(speed2);
        }
    


}