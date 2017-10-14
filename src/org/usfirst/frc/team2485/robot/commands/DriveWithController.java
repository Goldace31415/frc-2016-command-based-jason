package org.usfirst.frc.team2485.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

public class DriveWithController extends Command{

	
	public DriveWithController() {
		requires(RobotMap.driveTrain);
	}
	
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

}
