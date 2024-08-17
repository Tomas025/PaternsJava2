package CeilingFan;

public class CeilingFan {
    public static final int high = 3;
    public static final int medium = 2;
    public static final int low = 1;
    public static final int off = 0;
    private int speed = off;

    public void high() {
        speed = high;
        System.out.println("Ceiling fan is High");
    }

    public void medium() {
        speed = medium;
        System.out.println("Ceiling fan is Medium");
    }

    public void low() {
        speed = low;
        System.out.println("Ceiling fan is Low");
    }

    public void off() {
        speed = off;
        System.out.println("Ceiling fan is Off");
    }

    public int getSpeed() {
        return speed;
    }
}