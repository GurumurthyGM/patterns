package creational.abstractfactory;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class UIMaker {

    private static final Map<String, Supplier<UserInterfaceFactory>> uiTypes = new HashMap<>();

    static {
        uiTypes.put("RED", RedUserInterface::new);
        uiTypes.put("BLUE", BlueUserInterface::new);
    }

    public static UserInterfaceFactory createUI(String color){
        if(uiTypes.containsKey(color)){
            return uiTypes.get(color).get();
        }else {
            throw new IllegalArgumentException(color + " is not a valid color");
        }

    }
}
