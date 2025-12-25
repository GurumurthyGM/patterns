package creational.singleton;

/** When to Use Singleton
 *
 * Shared Resource Management
 *      Database connection pool
 *      Configuration manager
 *      Logging service
 *
 * Global State
 * When you need a single, consistent state across the application (e.g., application settings).
 *
 * Performance Optimization
 * When creating multiple instances would be expensive or unnecessary.
 *
 * Thread Safety
 * When multiple threads need to access the same instance without creating duplicates.
 */
public final class PrintSpooler {
    private static PrintSpooler instance;
    private PrintSpooler() {
    }

    public static PrintSpooler getInstance() {
        if (instance == null) {
            instance = new PrintSpooler();
        }
        return instance;
    }

    public void print(String data){
        System.out.println("Printing : "+data);
    }
}
