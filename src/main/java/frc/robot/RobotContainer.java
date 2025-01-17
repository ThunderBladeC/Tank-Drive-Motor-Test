// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import frc.robot.Constants.OperatorConstants;
import frc.robot.commands.Autos;
import frc.robot.commands.ExampleCommand;
import frc.robot.subsystems.ExampleSubsystem;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.Trigger;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and trigger mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  public final static CommandXboxController m_CommandXboxController = new CommandXboxController(0);
  public static WPI_TalonSRX motor1 = new WPI_TalonSRX(0);
  public static WPI_TalonSRX motor2 = new WPI_TalonSRX(1);
  public static ExampleSubsystem mExampleSubsystem = new ExampleSubsystem();

  DifferentialDrive diffDrive; 

  public RobotContainer() {
    configureBindings();
    // motor1.set(0.4);
    // motor2.set(0.2);
  }

  private void configureBindings() {}

  public Command getAutonomousCommand() {
    return Autos.exampleAuto(mExampleSubsystem);
  }
}
  















  