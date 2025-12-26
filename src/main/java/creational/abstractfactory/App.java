package creational.abstractfactory;

public class App {

    public UI createScreen(String clr){
        UserInterfaceFactory uif = UIMaker.createUI(clr);
        return new UI(uif.createButton(), uif.createCheckBox());
    }

    public static void main(String[] args) {

        App app = new App();
        System.out.println(app.createScreen("RED"));
        System.out.println(app.createScreen("BLUE"));

        System.out.println(app.createScreen("GREEN"));

    }
}
