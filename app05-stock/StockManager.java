import java.util.ArrayList;

/**
 * Manage the stock in a business.
 * The stock is described by zero or more Products.
 * 
 * @author (Timothhy Arole) 
 * @version (07.11.2020)
 */
public class StockManager
{
    // A list of the products.
    private ArrayList<Product> stock;

    /**
     * Initialise the stock manager.
     */
    public StockManager()
    {
        stock = new ArrayList<>();
    }

    /**
     * Add a product to the list.
     * @param item The item to be added.
     */
    public void addProduct(Product item)
    {
        stock.add(item);
    }

    /**
     * Removes product based on ID
     */
    public void removeProduct(int id)
    {
        Product product = findProduct(id);

        if(product !=null)
        {
            stock.remove(product);
            System.out.println("Remove Product " + id);

        }
        else
        {

            this.stock.remove(product);
            System.out.println("Product has been deleted");

        }  

    }

    //ATTEMPT
    /**
     * Sells quantities of stock
     */
    public int sellProduct(int id, int amount)
    {
        Product product = findProduct(id);
        product.sellProduct(amount);
        System.out.println( "Item has been sold!");
        return amount;
    }

    /**
     * Receive a delivery of a particular product.
     * Increase the quantity of the product by the given amount.
     * @param id The ID of the product.
     * @param amount The amount to increase the quantity by.
     */
    public void deliverProduct (int id, int amount)
    {
        Product product = findProduct(id);
        product.increaseQuantity(amount);
    }

    /**
     * Renames inputted product
     */
    public void renameProduct(int id,String name)
    {
        Product product = findProduct(id);
        product.renameProduct(name);
    }
    
    /**
     * Finds product in stock using part of its name 
     */
    public void searchProduct(String name)
    {
        for(Product product : stock)
        {
            if(product.getName().contains(name))
            {
                System.out.println(product);
            }
        }
    }

    /**
     * Try to find a product in the stock with the given id.
     * @return The identified product, or null if there is none
     *         with a matching ID.
     */
    public Product findProduct(int id)
    {

        for(Product product : stock)
        {
            if(product.getID() == id)
            {
                return product;
            }
        }

        return null;
    }

    /**
     * Checks for duplicate IDs
     */
    public boolean isDuplicateID(int id)
    {

        for(Product product : stock)
        {
            if(product.getID() == id)
            {
                return true;
            }
        }

        return false;
    }

    /**
     * Locate a product with the given ID, and return how
     * many of this item are in stock. If the ID does not
     * match any product, return zero.
     * @param id The ID of the product.
     * @return The quantity of the given product in stock.
     */
    public int numberInStock(int id)
    {
        return 0;
    }

    /**
     * Print details of the given product. If found,
     * its name and stock quantity will be shown.
     * @param id The ID of the product to look for.
     */
    public void printProduct(int id)
    {
        Product product = findProduct(id);

        if(product != null) 
        {
            System.out.println(product.toString());
        }
        else
        {
            System.out.println("This ID could not be found!");
        }
    }

    /**
     * Prints stock that are low on units
     */
    public void printLowStock()
    {
        for(Product product : stock)
        {
            if(product.getQuantity() <= 5)
            {
                product.print();
            }
        }

    }

    /**
     * Print out each product in the stock
     * in the order they are in the stock list
     */
    public void printAllProducts()
    {
        System.out.println();
        System.out.println("Arole's Stock List");
        System.out.println("====================");
        System.out.println();

        if(stock.size() == 0)
        {
            System.out.println("Currently no products within the stocklist");
        }
        else{
            for(Product product : stock)
            {
                System.out.println(product);
            }   
        }
        System.out.println();
    }
}
 