import java.util.Date;

/**
 * Write a description of class Ticket here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ticket
{
   // Journey Destination  
   private String destination;
   
   // This is the ticket price in pence
   private int price;
   
   // The date and time the ticket was issued
   private Date timeStamp;
   
  
    /**
     * Constructor for objects of class Ticket
     */
   public Ticket(String destination, int price)
    
    {
        timeStamp = new Date();
        this.destination = destination;
        this.price = price;
    }
    
    /**
     * Return the tickets destination as a String
     */
   public String getDestination(String newDestination)
    {
      return destination;  
    }
    
     /**
     * 
     */
    public void print()
   
    {
        System.out.print( " Ticket to " + destination); 
        System.out.print(" Cost " + price + "p ");
        System.out.println("Issued on:" + timeStamp);
    }
    
    
}
