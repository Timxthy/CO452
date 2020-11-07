
/**
 * Enumeration class coin - write a description of the enum class here
 *
 * @author Timothy Arole
 * @version 2020.11.05
 */
public enum coin
{
    P10(10),
    P20(20),
    P100(100),
    P200(200);
    
    private final int value;
    
    private coin(int value)
    {
        this.value = value;
    }
    
    public int getValue()
    {
        return value;
    }
}
