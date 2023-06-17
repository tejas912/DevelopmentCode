package org.firstinspires.ftc.teamcode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;

import org.firstinspires.ftc.teamcode.VergeTools.Chassis;
import org.firstinspires.ftc.teamcode.VergeTools.Motor;

@com.qualcomm.robotcore.eventloop.opmode.TeleOp (name = "DriverMode")
public class TeleOpProgram extends OpMode{
    Chassis chassis;
    int myVar;
    @Override
    public void init(){
        chassis = new Chassis(hardwareMap);
    }

    @Override
    public void loop(){
        //change from tj
        chassis.move(gamepad1.right_stick_x, gamepad1.right_stick_y);
        chassis.rotate(gamepad1.left_stick_x);
        if(gamepad1.right_bumper){
            chassis.limit(0.4f);
        }else{
            chassis.limit(1);
        }
        if(gamepad1.dpad_up){
            chassis.move(0, -1);
        }else if(gamepad1.dpad_down){
            chassis.move(0, 1);
        }
        if(gamepad1.dpad_right){
            chassis.move(1, 0);
        }else if(gamepad1.dpad_left){
            chassis.move(-1, 0);
        }
    }
}