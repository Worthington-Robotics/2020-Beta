package frc.robot;

import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.lib.statemachine.Action;
import frc.robot.actions.*;
import frc.robot.actions.driveactions.AnglePID;
import frc.robot.actions.driveactions.GyroLock;

public class OI {

    public OI() {
        ////////////Scary Vision Stuff////////////
        //Button cameraSwitch = new JoystickButton(Constants.MASTER, 3);
        Button anglePidButton = new JoystickButton(Constants.MASTER, 7);
        //Button selfCheck = new JoystickButton(Constants.MASTER, 11);
        Button ForceField = new JoystickButton(Constants.MASTER, 8);
        Button ForceFieldR = new JoystickButton(Constants.MASTER, 9);

        //cameraSwitch.toggleWhenPressed(Action.toCommand(new CameraSwitchAction()));
        anglePidButton.whileHeld(Action.toCommand(new AnglePID()));
        //selfCheck.whileHeld(Action.toCommand(new RunTestConditional(new AutoTestProtocol())));
        /*
        ForceField.whileHeld(Action.toCommand(new ForceField(34)));
        ForceFieldR.whileHeld(Action.toCommand(new ForceField(15)));
        */
        ////////////End Scary Stuff////////////

        ///////////Button Declarations///////////
        //Arm Poses
        Button cargoShip = new JoystickButton(Constants.LAUNCH_PAD, 13);
        Button groundCargo = new JoystickButton(Constants.LAUNCH_PAD, 10);
        Button botCargo = new JoystickButton(Constants.LAUNCH_PAD, 12);
        Button midCargo = new JoystickButton(Constants.LAUNCH_PAD, 4);
        Button highCargo = new JoystickButton(Constants.LAUNCH_PAD, 2);
        //Climb Stuff
        Button ElevatorUp = new JoystickButton(Constants.LAUNCH_PAD, 6);
        Button Pistons = new JoystickButton(Constants.LAUNCH_PAD, 16);
        Button ElevatorDown = new JoystickButton(Constants.LAUNCH_PAD, 15);
        Button crawlerForward = new JoystickButton(Constants.MASTER, 6);
        Button crawlerBackward = new JoystickButton(Constants.MASTER, 4);
        Button gyroLock = new JoystickButton(Constants.MASTER, 3);
        //Cargo Manipulator
        Button cargoRollout = new JoystickButton(Constants.LAUNCH_PAD, 5);
        Button cargoShoot = new JoystickButton(Constants.LAUNCH_PAD, 11);
        Button intake = new JoystickButton(Constants.LAUNCH_PAD, 14);
        //Stow/Unstow
        Button stow = new JoystickButton(Constants.LAUNCH_PAD, 8);
        Button unstow = new JoystickButton(Constants.LAUNCH_PAD, 7);
        Button lock = new JoystickButton(Constants.LAUNCH_PAD, 9);
        //Safety Things
        Button autoStopButton = new JoystickButton(Constants.LAUNCH_PAD, 1);
        Button ArmProx = new JoystickButton(Constants.LAUNCH_PAD, 3);

        ////////////Actions Tied To Buttons////////////
        //Safety Routines
        autoStopButton.whenPressed(Action.toCommand(new AStopAction()));
        //Climb Stuff
        /*bothClimb.whenPressed(Action.toCommand(new ModAction(new ClimbAction(DoubleSolenoid.Value.kForward, DoubleSolenoid.Value.kForward), new ClimbAction(DoubleSolenoid.Value.kReverse, DoubleSolenoid.Value.kReverse))));
        frontClimb.whenPressed(Action.toCommand(new ModAction(new ClimbAction(true, DoubleSolenoid.Value.kForward), new ClimbAction(true, DoubleSolenoid.Value.kReverse))));
        backClimb.whenPressed(Action.toCommand(new ModAction(new ClimbAction(false, DoubleSolenoid.Value.kForward), new ClimbAction(false, DoubleSolenoid.Value.kReverse))));
        */
        gyroLock.whileHeld(Action.toCommand(new GyroLock()));
    }
}