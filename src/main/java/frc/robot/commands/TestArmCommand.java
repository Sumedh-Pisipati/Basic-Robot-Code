package frc.robot.commands;
import frc.robot.subsystems.ArmSubsystem;
public class TestArmCommand {
    int ticks = 0;
    public void initialize() {
        System.out.println("begin test arm command");
    }
    public void execute() {
        ticks = ticks + 1;
        ArmSubsystem.setSpeedMotor1(Math.sin(ticks));
        ArmSubsystem.setSpeedMotor2(Math.cos(ticks));
        if (ticks > 600) {
            end();
        }
    }
    public void end() {
        ArmSubsystem.stopAllMotors();
    }
    public boolean isFinished() {
        return false;
    }
}
