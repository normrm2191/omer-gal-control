/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.GroupOfMotors;
import frc.robot.PID_Parameters;
import frc.robot.RobotMap;

/**
 * Add your docs here.
 */
public class Chassis extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  public GroupOfMotors motorsLeft;
  public GroupOfMotors motorsRight;


  public Chassis()
  {
      motorsLeft = new GroupOfMotors("Left", new PID_Parameters(1, 1, 1, 1, 1), 0/*to be changed*/);
      motorsRight = new GroupOfMotors("Right", new PID_Parameters(1, 1, 1, 1, 1), 0/*to be changed*/);
  }
  
  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());

    /*public Talon first_left_talon;
    public Talon second_left_talon = 1;*/

  }

  public void setPower(Double left, Double right)
  {
  }
}
