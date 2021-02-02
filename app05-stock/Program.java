
/**
 * Write a description of class Program here.
 *
 * @author (Timothy Arole)
 * @version (5/12/2020)
 */
public class Program
{
    //Static means we can call this method directly from the class without having to create an object.
    private static StockApp app;

    /**
     * This class creates and runs an instance of
     * the StockApp class
     */
    public static void main()
    {
        app = new StockApp();
        app.run();

    }
}
