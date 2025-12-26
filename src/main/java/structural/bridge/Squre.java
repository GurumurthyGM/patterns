package structural.bridge;

public class Squre implements Shape, Color {


    String color;

    Squre(String color) {
        this.color = color;
    }

    @Override
    public String getShape() {
        return "SQUARE";
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "SQUARE : " + color;
    }
}
