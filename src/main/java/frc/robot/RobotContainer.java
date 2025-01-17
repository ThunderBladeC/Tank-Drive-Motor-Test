// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.commands.Autos;
import frc.robot.subsystems.ExampleSubsystem;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and trigger mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  public final static CommandXboxController m_CommandXboxController = new CommandXboxController(0);
  public static WPI_TalonSRX motor1 = new WPI_TalonSRX(1);
  public static WPI_TalonSRX motor2 = new WPI_TalonSRX(0);
  public static WPI_TalonSRX motor3 = new WPI_TalonSRX(2);
  public static WPI_TalonSRX motor4 = new WPI_TalonSRX(3);
  public static ExampleSubsystem mExampleSubsystem = new ExampleSubsystem();

  DifferentialDrive diffDrive; 

  public RobotContainer() {
    configureBindings();
    // motor1.set(0.4);
    // motor2.set(0.2);
  }

  private void configureBindings() {
    m_CommandXboxController.a().whileTrue(
      Commands.run(() -> motor1.set(0.2))
      .finallyDo(() -> motor1.set(0))
    );
    m_CommandXboxController.b().whileTrue(
      Commands.run(() -> motor1.set(-0.2))
      .finallyDo(() -> motor1.set(0))
    );
  }

  public Command getAutonomousCommand() {
    return Autos.exampleAuto(mExampleSubsystem);
  }
}
  















  