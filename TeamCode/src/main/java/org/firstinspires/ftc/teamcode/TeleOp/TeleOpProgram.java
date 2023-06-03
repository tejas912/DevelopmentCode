package org.firstinspires.ftc.teamcode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;

import org.firstinspires.ftc.teamcode.VergeTools.Chassis;
import org.firstinspires.ftc.teamcode.VergeTools.Motor;

@com.qualcomm.robotcore.eventloop.opmode.TeleOp (name = "DriverMode")
public class TeleOpProgram extends OpMode{
    Chassis chassis = new Chassis(hardwareMap);

    @Override
    public void init(){

    }

    @Override
    public void loop(){
        chassis.x.move(gamepad1.left_stick_x);
        chassis.y.move(gamepad1.left_stick_y);
    }
}