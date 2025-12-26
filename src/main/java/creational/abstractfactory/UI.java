package creational.abstractfactory;

public class UI {
    private Button button;
    private CheckBox checkBox;

    UI(Button button, CheckBox checkBox) {
        this.button = button;
        this.checkBox = checkBox;
    }

    @Override
    public String toString() {
        return "UI: Button: " + button.getColor() + ", CheckBox: " + checkBox.getColor();
    }
}
