///**
// * Created by NickNatali on 1/16/17.
//* The item class refers to a single item that can be purchased.
//*An Item object stores information about an individual item.
// */
public class Item {

    /**
     * Variables
     */
    protected String name;
    protected Double price;

    /**
     * Constructor
     */
    public Item(String name, Double price) {
        //Constructor that takes the item's name (a string) and its price (a real number) as arguments
        this.name = name;
        this.price = price;
    }

    /**
     * Returns the name of the item as passed to the constructor.
     */
    public String getName() {
    return name;
    }

    /**
     * Returns a real number representing the price for a given quantity of the item.
     */
    public double priceFor(int quantity) {
    return (price * quantity);
    }

    /**
     * Returns a text representation of this item.
     */
    public String toString() {
    return (name + "," + price);
    }
    }
