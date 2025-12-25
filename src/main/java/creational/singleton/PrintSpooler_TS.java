package creational.singleton;


/** * Why enum is preferred for Singleton in Java
 *
 * Thread Safety by Default
 * Enums in Java are inherently thread-safe. You don’t need extra synchronization logic.
 *
 * Serialization Safety
 * Normal Singleton classes need special handling to prevent multiple instances during deserialization.
 * Enums automatically handle this because Java guarantees a single instance per enum constant.
 *
 * Reflection Safety
 * Reflection can break traditional Singleton by calling a private constructor.
 * Enums are immune to this because their constructors cannot be accessed via reflection.
 *
 *
 * Simplicity
 * No need for complex boilerplate code (like private constructor, getInstance() method, etc.).
 * Just define an enum with one element.
 */
public enum PrintSpooler_TS {
    INSTANCE;

//    public static PrintSpooler_TS getInstance() {
//        return INSTANCE;
//    }

    public void print(String data){
        System.out.println("Printing : "+data);
    }
}
