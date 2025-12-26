package structural.bridge;

public class Circle implements Shape, Color {

    String color;


    Circle(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }


    @Override
    public String getShape(){
        return "CIRCLE";
    }

    @Override
    public String toString() {
        return "CIRCLE : " + color;
    }
}
