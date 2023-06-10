package org.firstinspires.ftc.teamcode.VergeTools;

import com.qualcomm.robotcore.hardware.HardwareMap;

public class Chassis {
    String[] motorNames = {"frontright", "backright", "frontleft", "backleft"};
    Motor[] motors = new Motor[4];
    public Chassis(HardwareMap hardwareMap){
        for (int i = 0; i < motors.length; i++) {
            motors[i] = new Motor(motorNames[i], hardwareMap);
        }
    }

    public void move(float x, float y){
        motors[0].move(x + y);
        motors[1].move(-x + y);
        motors[2].move(x - y);
        motors[3].move(-x - y);
    }

    public void rotate(float amount){
        for (int i = 0; i < motors.length; i++) {
            motors[i].move(amount);
        }
    }

    public void limit(float amount){
        for (int i = 0; i < motors.length; i++) {
            motors[i].mapLimit(amount);
        }
    }

    public void stop(){
        for (int i = 0; i < motors.length; i++) {
            motors[i].stop();
        }
    }
}