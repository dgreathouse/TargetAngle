// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandScheduler;

public class Robot extends TimedRobot {
  private Command m_autonomousCommand;

  private RobotContainer m_robotContainer;

  @Override
  public void robotInit() {

    m_robotContainer = new RobotContainer();
  }

  @Override
  public void robotPeriodic() {

    TargetAngle ta = new TargetAngle(45);
    // Test 0,0
    ta.setTargetAngle(0, 0);
    double ang = ta.getTargetAngle().getDegrees();
    double actAng = ta.getActualAngle();
    double hyp = ta.getHyp();
    // Test 1,0.85
    ta.setTargetAngle(1, .85);
    ang = ta.getTargetAngle().getDegrees();
    actAng = ta.getActualAngle();
    hyp = ta.getHyp();

    // Test 1,0.1
    ta.setTargetAngle(1, .1);
    ang = ta.getTargetAngle().getDegrees();
    actAng = ta.getActualAngle();
    hyp = ta.getHyp();
   // Test 1,0.2
    ta.setTargetAngle(1, .2);
    ang = ta.getTargetAngle().getDegrees();
    actAng = ta.getActualAngle();
    hyp = ta.getHyp();



    CommandScheduler.getInstance().run();
  }

  @Override
  public void disabledInit() {}

  @Override
  public void disabledPeriodic() {}

  @Override
  public void disabledExit() {}

  @Override
  public void autonomousInit() {
    m_autonomousCommand = m_robotContainer.getAutonomousCommand();

    if (m_autonomousCommand != null) {
      m_autonomousCommand.schedule();
    }
  }

  @Override
  public void autonomousPeriodic() {}

  @Override
  public void autonomousExit() {}

  @Override
  public void teleopInit() {
    if (m_autonomousCommand != null) {
      m_autonomousCommand.cancel();
    }
  }

  @Override
  public void teleopPeriodic() {}

  @Override
  public void teleopExit() {}

  @Override
  public void testInit() {
    CommandScheduler.getInstance().cancelAll();
  }

  @Override
  public void testPeriodic() {}

  @Override
  public void testExit() {}
}
