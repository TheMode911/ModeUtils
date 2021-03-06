package fr.themode.utils;

public class MathUtils {

    public static boolean isNumber(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }

    public static long minMax(long value, long min, long max) {
        return value < min ? min : value > max ? max : value;
    }

    public static int minMax(int value, int min, int max) {
        return value < min ? min : value > max ? max : value;
    }

    public static double minMax(double value, double min, double max) {
        return value < min ? min : value > max ? max : value;
    }

    public static float minMax(float value, float min, float max) {
        return value < min ? min : value > max ? max : value;
    }

    public static double getAngle(double x, double y, double x2, double y2) {
        return Math.toDegrees(Math.atan2(y2 - y, x2 - x)) + 180;
    }

    public static double getDistance(double x, double y, double x2, double y2) {
        return Math.sqrt((x - x2) * (x - x2) + (y - y2) * (y - y2));
    }

    public static float round(double value, int precision) {
        int scale = (int) Math.pow(10, precision);
        return (float) Math.round(value * scale) / scale;
    }

    public static boolean between(int number, int min, int max) {
        return (number >= min && number <= max);
    }

    public static float lerp(float point1, float point2, float alpha) {
        return point1 + alpha * (point2 - point1);
    }

    public static AngleValue getMoveValue(double angle, float x, float y, float xSpeed, float ySpeed) {
        x = (float) Math.cos(Math.toRadians(angle)) * xSpeed;
        y = (float) Math.sin(Math.toRadians(angle)) * ySpeed;
        return new AngleValue(x, y);
    }

    public static AngleValue getMoveValue(double angle, float x, float y, float speed) {
        return getMoveValue(angle, x, y, speed, speed);
    }

    public static class AngleValue {

        public float x, y;

        public AngleValue(float x, float y) {
            this.x = x;
            this.y = y;
        }
    }
}
