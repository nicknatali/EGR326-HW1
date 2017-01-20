///**
//* Created by NickNatali on 1/16/17.
//This class contains information about a purchase order of a particular item: namely, the item
//itself, and the quantity desired to be purchased.
// */
public class Purchase  {

    /**
     * Variables
     */
    private Item item;
    private int quantity;

    /**
     * Constructor
     */
    public Purchase(Item item, int quantity) {
    //Constructor that creates a pruchase for the given item and given quantity (an integer).
        this.item = item;
        this.quantity = quantity;

    }

    /**
     * Returns the cost to purchase for the given item and given quantity (an integer).
     */
    public double getPrice() { return  item.priceFor(quantity); }

    /**
     * Returns the quantity for this purchase as passed to the constructor.
     */
    public int getQuantity() {
    return quantity;
    }

    public Item getItem() {
    return item;
    }

    /**
     * Returns whether this purchase has a quantity of 0 (true if so).
     */
    public boolean isEmpty() {
        if(quantity == 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Returns whether this purchase is for the same item as the given other purchase (true if so, false if not).
     */
    public boolean matches(Purchase purchase) {
        if(item.getName().equals(purchase.getItem().getName())) {
            return true;
        } else {
            return false;
        }
    }
}
