package abstractfactory;

import java.awt.*;

public interface UserInterfaceFactory {
    Button createButton();

    CheckBox createCheckBox();
}
