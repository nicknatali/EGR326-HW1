//Created by NickNatali on 1/16/17.
//The DiscountedItem class is a subcategory of Item. A DiscountedItem object stores information
//about an individual item that has a bulk discount when purchased in sufficient quantity.
public class DiscountedItem extends Item {

    /**
     *Variables
     */
    private double bulkPrice;
    private int bulkQuantity;

    /**
     *Constructor
     */
    public DiscountedItem(String name, Double price, int bulkQuantity, double bulkPrice) {
        super(name,price);
        this.bulkQuantity = bulkQuantity;
        this.bulkPrice = bulkPrice;
    }

    /**
     *Returns a text representation of this discounted item
     */
    public String toString() {
        return (name + ", " + price + " (" + bulkQuantity + " for" + bulkPrice + ")");
    }

    /**
     *Returns a real number representing the price for a given quantity of the item.
     */
    @Override
    public double priceFor(int quantity) {
        return ((((int) (quantity / bulkQuantity)) * bulkPrice) + ((quantity % bulkQuantity) * price));
    }

}
