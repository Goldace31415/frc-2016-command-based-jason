package org.usfirst.frc.team2485.robot.commands;

import org.usfirst.frc.team2485.robot.RobotMap;
import org.usfirst.frc.team2485.robot.BoulderStager.StagerPosition;

import edu.wpi.first.wpilibj.command.InstantCommand;

public class SetStager extends InstantCommand{

	public SetStager() {
		requires(RobotMap.boulderStager);
	}

	public void initialize() {
		if(RobotMap.boulderStager.getPosition().equals(StagerPosition.NEUTRAL))
			RobotMap.boulderStager.setPosition(StagerPosition.SHOOTING);
		else if(RobotMap.boulderStager.getPosition().equals(StagerPosition.SHOOTING)) 
			RobotMap.boulderStager.setPosition(StagerPosition.INTAKE);
		else if(RobotMap.boulderStager.getPosition().equals(StagerPosition.INTAKE)) 
			RobotMap.boulderStager.setPosition(StagerPosition.NEUTRAL);
	}

}