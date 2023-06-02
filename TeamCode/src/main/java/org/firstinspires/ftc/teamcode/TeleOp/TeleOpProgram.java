package org.firstinspires.ftc.teamcode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;

import org.firstinspires.ftc.teamcode.Code.DriverMode;

@com.qualcomm.robotcore.eventloop.opmode.TeleOp (name = "DriverMode")
public class TeleOpProgram extends OpMode{
    DriverMode driverMode;

    @Override
    public void init(){
        driverMode = new DriverMode();
        driverMode.Init(hardwareMap);
    }

    @Override
    public void loop(){
        try {
            driverMode.Loop();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}