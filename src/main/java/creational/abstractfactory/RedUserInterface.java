package creational.abstractfactory;

public class RedUserInterface implements UserInterfaceFactory {

    @Override
    public Button createButton() {
        return new RedButton();
    }
    @Override
    public CheckBox createCheckBox() {
        return new RedCheckBox();
    }
}

