package org.usfirst.frc.team2485.robot;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

public class BoulderStager extends Subsystem{
	
	
	private StagerPosition position;
	
	public enum StagerPosition {
		INTAKE, NEUTRAL, SHOOTING;
	}
	
	public BoulderStager() {
		
		setPosition(StagerPosition.NEUTRAL);
	}
	
	public void setPosition(StagerPosition pos) {
		if(pos.equals(StagerPosition.NEUTRAL)) {
			RobotMap.solenoid1.set(false);
			RobotMap.solenoid2.set(false);
			position = StagerPosition.NEUTRAL;
		} else if(pos.equals(StagerPosition.INTAKE)) {
			RobotMap.solenoid1.set(false);
			RobotMap.solenoid2.set(true);
			position = StagerPosition.INTAKE;
		} else if(pos.equals(StagerPosition.SHOOTING)) {
			RobotMap.solenoid1.set(true);
			RobotMap.solenoid2.set(false);
			position = StagerPosition.SHOOTING;
		}
	}
	
	public StagerPosition getPosition() {
		return position;
	}
	
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}

	
	
	
}
