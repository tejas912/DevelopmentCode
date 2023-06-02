package org.firstinspires.ftc.teamcode.Code;

import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.VergeTools.Motor;

public class DriverMode {
    Motor motor;
    public void Init(HardwareMap hardwareMap){
        motor = new Motor("motor", hardwareMap);
    }
    public void Loop() throws InterruptedException {
        motor.mapLimit(0.5);
        motor.move(1);
    }
}