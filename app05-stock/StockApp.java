
/**
 * This app provides a user interface to the
 * stock manager so that users can add, edit,
 * print and remove stock products
 *
 * @author Student Name
 * @version 5/12/2020
 */
public class StockApp
{
    public final int FIRST_ID = 200;

    // Use to get user input - reads input from the user
    private InputReader input;

    private StockManager manager;

    private StockDemo demo;

    private int nextID = FIRST_ID;

    /**
     * Constructor for objects of class StockApp
     */
    public StockApp()
    {
        input = new InputReader();
        manager = new StockManager();
        demo = new StockDemo(manager);
    }

    /**
     * Starts the program
     */
    public void run()
    {
        boolean finished = false;

        while(!finished)
        {
            printHeading();
            printMenuChoices();

            String choice = input.getInput();
            choice = choice.toLowerCase();

            executeMenuChoice(choice);

            if(choice.equals("quit"))
                finished = true;
        }
    }

    /**
     * Excutes Menu Choice
     */
    public void executeMenuChoice(String choice)
    {
        if(choice.equals("add"))
        {
            addProduct();
        }
        else if(choice.equals("remove"))
        {
            removeProduct();
        }
        else if(choice.equals("printall"))
        {   printAllProducts();
            
        }
        else if
        
        else if 
        
        else if
        
    }
    
    /**
     * Adds to specified product to the stock list
     */
  
    public void addProduct()
    {
        System.out.println("Add a new Product");
        System.out.println();

        System.out.println("Please enter name of the product");
        String name = input.getInput();

        boolean isDuplicate = manager.isDuplicateID(nextID);
        
        if(isDuplicate)
        {
            boolean finished = false;
            
            while(!finished)
            {
                nextID++;
                if(!manager.isDuplicateID(nextID))
                {
                    finished = true;
                }
            }
        }
        else
        {
            Product product = new Product(nextID, name);
            manager.addProduct(product);

            System.out.println("You have added " + product + " to the Stock list!");
        }

    }

    /**
     * Removes specified product from the stock list
     */
    public void removeProduct()
    {
        System.out.println("Remove a Product from the Stock list");
        System.out.println();

        System.out.println("Please enter ID of the product ");
        String number = input.getInput();

        int id = Integer.parseInt(number);
        manager.removeProduct(id);
    }
    
    /**
     * 
     */
    public void renameProduct()
    {
        System.out.println("Renaming a product");
        System.out.println();
        
        System.out.println("Please enter ID of the product ");
        String number = input.getInput();
        int id = Integer.parseInt(number);
        
        System.out.println("Please enter the new name");
        String name = input.getInput();
        
        manager.renameProduct(id, name);
    }
    
    /**
     * Sells specified product in the stock list
     */
    public void sellProduct()
    {
        System.out.println("Selling Product");
        System.out.println();
        
        System.out.println("Please enter ID of the product ");
        String number = input.getInput();
        int id = Integer.parseInt(number);
        
        System.out.println("Please enter an Amount ");
        number = input.getInput();
        int amount = Integer.parseInt(number);
        
        manager.sellProduct(id, amount);
        
        
        
    }
    
    /**
     * Delivers specified product 
     */
    public void deliverProduct()
    {
        System.out.println("Taking deliver of products");
        System.out.println();
        
        System.out.println("Please enter ID of the product ");
        String number = input.getInput();
        int id = Integer.parseInt(number);
        
        System.out.println("Please enter an Amount ");
        number = input.getInput();
        int amount = Integer.parseInt(number);
        
        manager.deliverProduct(id, amount);
        
    }
    
    /**
     * 
     */
    public void restockAllProducts()
    {
        
    }
    
    /**
     * Print out a menu of operation choices
     */
    private void printMenuChoices()
    {
        System.out.println();
        System.out.println("    Add:        Add a new product");
        System.out.println("    Remove:     Remove an old product");
        System.out.println("    Sell:       Sell a product from the stock list");
        System.out.println("    Deliver:    Deliver a product to the stock list");
        System.out.println("    ");
        System.out.println("    PrintAll:   Print all products");
        System.out.println("    Quit:       Quit the program");
        System.out.println();        
    }

    /**
     * 
     */
    public void printAllProducts()
    {
        manager.printAllProducts(); 
        
    }

    /**
     * Print the title of the program and the authors name
     */
    private void printHeading()
    {
        System.out.println("******************************");
        System.out.println(" Stock Management Application ");
        System.out.println("    App05: by Timothy A");
        System.out.println("******************************");
    }
}
