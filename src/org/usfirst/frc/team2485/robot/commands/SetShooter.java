package org.usfirst.frc.team2485.robot.commands;

import org.usfirst.frc.team2485.robot.RobotMap;

import edu.wpi.first.wpilibj.command.InstantCommand;

public class SetShooter extends InstantCommand{
	
	private static double PWM = 0.4;
	
	public SetShooter() {
		requires(RobotMap.shooter);
	}
	
	public void initialize() {
		RobotMap.shooter.setShooter(PWM);
	}
}
