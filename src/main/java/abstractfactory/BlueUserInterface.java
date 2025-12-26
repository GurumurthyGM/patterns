package abstractfactory;


import java.awt.*;

public class BlueUserInterface implements UserInterfaceFactory {

    @Override
    public Button createButton() {
        return new BlueButton();
    }


    @Override
    public CheckBox createCheckBox() {
        return new BlueCheckBox();
    }
}
