package org.usfirst.frc.team2485.robot.commands;

import org.usfirst.frc.team2485.robot.OI;
import org.usfirst.frc.team2485.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

public class IntakeArmWithController extends Command{

	private static double PWM;
	
	
	
	public IntakeArmWithController(){
		requires(RobotMap.intakeArm);
	}
	
	public void execute() {
		
		
		PWM = OI.operator.getRawAxis(OI.XBOX_AXIS_LY);
		
		if(Math.abs(PWM) <= 0.1) {
			PWM = 0;
		}
		
		//Halve PWM
		PWM *= 0.5;
		
		
		RobotMap.intakeArm.setManual(PWM);
	}
	
	
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}
}
