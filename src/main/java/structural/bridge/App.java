package structural.bridge;

import java.awt.*;

public class App {

    public static void main(String[] args) {
        Shape circle = new Circle("RED");
        System.out.println(circle);

        Shape squre = new Squre("BLUE");
        System.out.println(squre);
    }

}
