package org.firstinspires.ftc.teamcode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;

import org.firstinspires.ftc.teamcode.VergeTools.Chassis;
import org.firstinspires.ftc.teamcode.VergeTools.Motor;

@com.qualcomm.robotcore.eventloop.opmode.TeleOp (name = "DriverMode")
public class TeleOpProgram extends OpMode{
    Motor frontRight;
    Motor frontLeft;
    Motor backRight;
    Motor backLeft;
    int myVar;
    @Override
    public void init(){
        frontRight = new Motor("frontright", hardwareMap);
        frontLeft = new Motor("frontleft", hardwareMap);
        backRight = new Motor("backright", hardwareMap);
        backLeft = new Motor("backleft", hardwareMap);
    }

    @Override
    public void loop(){
        frontLeft.move(-gamepad1.right_stick_y + gamepad1.right_stick_x);
        backLeft.move(-gamepad1.right_stick_y - gamepad1.right_stick_x);
        frontRight.move(gamepad1.right_stick_y + gamepad1.right_stick_x);
        backRight.move(gamepad1.right_stick_y - gamepad1.right_stick_x);

        frontLeft.move(gamepad1.left_stick_x);
        backLeft.move(gamepad1.left_stick_x);
        frontRight.move(gamepad1.left_stick_x);
        backRight.move(gamepad1.left_stick_x);
    }
}