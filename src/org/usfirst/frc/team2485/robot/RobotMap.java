package org.usfirst.frc.team2485.robot;


import java.util.ArrayList;

import org.usfirst.frc.team2485.robot.subsystems.DriveTrain;
import org.usfirst.frc.team2485.robot.subsystems.SpeedControllerWrapper;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.AnalogPotentiometer;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.VictorSP;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */

public class RobotMap {
	
	public static VictorSP[] rightDriveVictorSPs;
	public static VictorSP[] leftDriveVictorSPs;
	
	public static Encoder leftDriveEncoder;
	public static Encoder rightDriveEncoder;
	
	public static SpeedControllerWrapper rightDriveWrapper;
	public static SpeedControllerWrapper leftDriveWrapper;
	
	public static DriveTrain driveTrain;
	
	public static CANTalon shooterMotorLeft;
	public static CANTalon shooterMotorRight;
	
	public static SpeedControllerWrapper shooterWrapper;
	
	public static Solenoid solenoid1;
	public static Solenoid solenoid2;
	public static BoulderStager boulderStager;
	
	public static Encoder shooterEnc;
	
	public static Solenoid upperSolenoid;
	public static Solenoid lowerSolenoid;
	
	public static Shooter shooter;
	
	public static VictorSP armMotor;
	
	public static SpeedControllerWrapper armWrapper;
	
	public static InvertedAbsoluteEncoder armEncoder;
	
	public static IntakeArm intakeArm;
	

	
	public static void init() {
		rightDriveVictorSPs = new VictorSP[] {new VictorSP(5), new VictorSP(6), new VictorSP(7)};
		leftDriveVictorSPs = new VictorSP[] {new VictorSP(2), new VictorSP(3), new VictorSP(4)};
		
		rightDriveWrapper = new SpeedControllerWrapper(rightDriveVictorSPs);
		leftDriveWrapper = new SpeedControllerWrapper(leftDriveVictorSPs);
		
		rightDriveEncoder = new Encoder(4, 5);
		leftDriveEncoder = new Encoder(2, 3);
		
		
		
		shooterMotorLeft = new CANTalon(2);
		shooterMotorRight = new CANTalon(3);
		
		
		SpeedController[] shooterMotors = {shooterMotorLeft, shooterMotorRight};
		
		shooterWrapper = new SpeedControllerWrapper(shooterMotors);
		
		shooterEnc = new Encoder(6, 7);
		
		solenoid1 = new Solenoid(6);
		solenoid2 = new Solenoid(7);
		
		lowerSolenoid = new Solenoid(4);
		upperSolenoid = new Solenoid(5);
		
		armMotor = new VictorSP(0);
		
		armWrapper = new SpeedControllerWrapper(armMotor);
		
		armEncoder = new InvertedAbsoluteEncoder(new AnalogPotentiometer(0));
		
		boulderStager = new BoulderStager();
		intakeArm = new IntakeArm();
		shooter = new Shooter();
		driveTrain = new DriveTrain();

		
		
	}
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
	
	
	
}
