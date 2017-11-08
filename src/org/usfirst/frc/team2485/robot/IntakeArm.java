package org.usfirst.frc.team2485.robot;

import org.usfirst.frc.team2485.robot.subsystems.SpeedControllerWrapper;

import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.SpeedController;

public class IntakeArm extends Subsystem {
	

	public static final double ABSOLUTE_TOLERANCE = 0.01;

	public static double FLOOR_POSITION = 0.122,

			LOW_NO_INTAKE_POSITION = (FLOOR_POSITION + 0.06) % 1,
			INTAKE_POSITION = (FLOOR_POSITION + 0.09) % 1,
			PORTCULLIS_POSITION = (FLOOR_POSITION + 0.261) % 1,
			FULL_UP_POSITION = (FLOOR_POSITION + 0.320) % 1;


	public IntakeArm() {
		
	}

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub

	}
	
	public void setManual(double PWM) {
		double encoderPos = RobotMap.armEncoder.get();
		boolean disableDownwards = false;
		
		if (FLOOR_POSITION > 0.1) {
			if (encoderPos < FLOOR_POSITION
					&& Math.abs(encoderPos - FLOOR_POSITION) < 0.1) {
				disableDownwards = true;
			}
		} else {
			if (encoderPos < FLOOR_POSITION
					|| Math.abs((encoderPos - 1) - FLOOR_POSITION) < 0.1) {
				disableDownwards = true;
			}
		}

		boolean disableUpwards = false;
		if (FULL_UP_POSITION < 0.9) {
			if (encoderPos > FULL_UP_POSITION
					&& Math.abs(encoderPos - FULL_UP_POSITION) < 0.1) {
				disableUpwards = true;
			}
		} else {
			if (encoderPos > FULL_UP_POSITION
					|| Math.abs((encoderPos + 1) - FULL_UP_POSITION) < 0.1) {
				disableUpwards = true;
			}
		}
		
		if(PWM < 0) {
			if(!disableDownwards) {
				RobotMap.armWrapper.set(PWM);
			} else {
				RobotMap.armWrapper.set(PWM);
			}
		} else {
			if(disableUpwards) {
				RobotMap.armWrapper.set(0);
			} else {
				RobotMap.armWrapper.set(PWM);
			}
		}
		
	}
	
	public double getCurrentPosition() {
		return RobotMap.armEncoder.get();
	}
	
}
