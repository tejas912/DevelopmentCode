package org.firstinspires.ftc.teamcode.VergeTools;
public class Util {
    public static double clamp(double value, double min, double max){
        return value > max ? max : value < min ? min : value;
    }
    public static double clamp(double value, double limit){
        return value > Math.abs(limit) ? Math.abs(limit) : value < -Math.abs(limit) ? -Math.abs(limit) : value;
    }
    public static double Map(double value, double limit){
        return value * limit;
    }

    public static double Map(double value, double min, double max){
        double range = (max - min) / 2;
        double middle = (max + min) / 2;
        return (range * value) + middle;
    }
}
