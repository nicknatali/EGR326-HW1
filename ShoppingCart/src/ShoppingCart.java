import java.util.ArrayList;

///**
// * Created by NickNatali on 1/16/17.
//* This class contains information about the customer's overall order, implemented as a
//* collection of Purchases. The internal order of the purchases in the cart is unspecified.
// */
public class ShoppingCart {

    /**
     * Variables
     */
    private ArrayList<Purchase> shoppingCart;
    private boolean hasDiscount = false;

    /**
     * Constructor
     */
    public ShoppingCart() {
    shoppingCart = new ArrayList<>();
    }

    /**
     * Adds a purchase to the shopping cart, replacing any previous purchase for this item with the new purchase.
     */
    public void add(Purchase purchase) {
        for(int i =0; i < shoppingCart.size(); i++) {
            //Loop through the cart to check if an item is in the cart, replace if found.
            if(shoppingCart.get(i).getItem().getName().equals(purchase.getItem().getName())) {
                shoppingCart.remove(i);
                shoppingCart.add(purchase);
                return;
            }
        }
        //If not, add the new purchase
        shoppingCart.add(purchase);
    }

    /**
     * Removes all purchases from the cart
     */
    public void clearAll() {
    shoppingCart.clear();
    }

    /**
     * Returns the total cost of all the purchases in the shopping cart.
     */
    public double getTotal() {
        double totalPrice = 0;
        int totalQuantity = 0;
            for(int i = 0; i < shoppingCart.size(); i++ ) {
                totalPrice += shoppingCart.get(i).getPrice();
                totalQuantity += shoppingCart.get(i).getQuantity();
         }
            if(totalQuantity >= 20 && hasDiscount == true){
                return totalPrice - totalPrice * .1;
            }
                return totalPrice;
    }

    /**
     *  Returns whether or not this cart should get a 10% discount when it contains 20 total items or more.
     */
    public boolean hasDiscount() { return hasDiscount; }

    /**
     * Sets whether or not this cart should get a 10% discount when it contains 20 total items
     */
    public void setDiscount(Boolean value) {
    hasDiscount = value;
    }

    /**
     * Returns the total quantity from all combined purchases in this cart.
     */
    public int totalQuantity() {
        int total = 0;
        for(int i = 0; i < shoppingCart.size(); i++) {
            total += shoppingCart.get(i).getQuantity();
        }
        return total;
    }

    /**
     * Returns the percentage to discount carts that contain enough items.
     */
    public static double getDiscountPercentage() {
    return 10;
    }

    /**
     * Returns the minimum quantity where a discount will apply to carts.
     */
    public static int getDiscountQuantity() { return 20; }

}
