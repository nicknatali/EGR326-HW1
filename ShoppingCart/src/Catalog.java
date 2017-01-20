/**
/* Created by NickNatali on 1/16/17.
/* The Catalog class contains information about all items available for purchase.
 /*
*/


import java.util.ArrayList;
import java.util.Iterator;

public class Catalog implements Iterable<Item> {

    /**
    * Variables
    */
    private String storeName;
    private ArrayList<Item> catalogItems = new ArrayList<>();

    /**
    * Constructor
    */
    public Catalog(String storeName) {
          this.storeName = storeName;
    }

    /**
    *Add the given item to the end of this catalog's collection of items.
    */
    public void add(Item item) {
          catalogItems.add(item);
    }

    /**
     *Returns the item, if any, whose name exactly matches the given name.
     */
    public Item getItem(String name) {
        for(Item each : catalogItems) {
            if(each.getName().equals(name)) {
                   return each;
               }
            }
        return null;
    }

    /**
     *Returns the catalog's store name as passed to the constructor.
     */
    public String getStoreName() {
        return storeName;
    }

    /**
     * Returns an iterator over all items in the catalog.
     */
    @Override
    public Iterator<Item> iterator() {
        return catalogItems.iterator();
    }

}

