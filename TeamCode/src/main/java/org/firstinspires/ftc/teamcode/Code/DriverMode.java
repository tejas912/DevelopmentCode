package org.firstinspires.ftc.teamcode.Code;

import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.teamcode.VergeTools.Motor;

public class DriverMode {
    Motor motor;
    public void Init(HardwareMap hardwareMap){
        motor = new Motor("motor", hardwareMap);
    }
    public void Loop() throws InterruptedException {
        for (float i = 0; i <= 1; i += 0.01){
            motor.move(500);
            Thread.sleep(10);
        }
        for (float i = 1; i >= 0; i -= 0.1){
            motor.move(500);
            Thread.sleep(10);
        }
    }
}