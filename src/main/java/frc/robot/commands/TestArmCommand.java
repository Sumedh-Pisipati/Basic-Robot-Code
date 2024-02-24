package frc.robot.commands;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.ArmSubsystem;
public class TestArmCommand extends CommandBase {
    int ticks = 0;
    public void initialize() {
        System.out.println("begin test arm command");
    }
    @Override
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
        return ticks > 600;
    }
}
