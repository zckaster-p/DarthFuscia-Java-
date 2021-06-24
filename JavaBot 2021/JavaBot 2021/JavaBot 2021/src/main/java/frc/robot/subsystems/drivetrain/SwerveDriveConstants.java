package frc.robot.subsystems.drivetrain;


public interface SwerveDriveConstants {
    /*PID Constants*/
    public final double kP = 0.5 /*1.3*/, kI = 1e-6, kD = 0.0001, kIz = 0.001, kFF = 0 /*0.000015*/, kMaxOutput = 1.0, kMinOutput = -1.0;
    public final double dkP = 0.0003, dkI = 1e-6, dkD = 0.00003, dkIz = 0.001, dkFF = 0.000156, dkMaxOutput = 1.0, dkMinOutput = -1.0;
    /*Length and Width of the robot */
    public final double L = 30;
    public final double W = 30;
    
}