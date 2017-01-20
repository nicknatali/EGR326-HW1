/**
 * Created by NickNatali on 1/16/17.
 * ShopTest is a class designed to test various methods within the program. It constructs objects of
 * other classes and calls some of their methods.
 */
import org.junit.Assert;
import org.junit.Test;
public class ShopTest {

    @Test
    public void itemTest() {
        //Arrange
        Item testItem = new Item("Protein", 30.33);

        //Act
        String name = testItem.getName();
        Double price = testItem.priceFor(1);

        //Assert
        Assert.assertEquals("Invalid Price!",30.33, price, 0.0);
        Assert.assertEquals("Incorrect name", "Protein", name);
    }

    @Test
    public void discountItemTest() {
        //Arrange
        DiscountedItem discountTest = new DiscountedItem("Pantene", 2.00, 20,30.00);

        //Act
        String name = discountTest.getName();
        double price = discountTest.priceFor(1);
        double discountPrice = discountTest.priceFor(20);

        //Assert
        Assert.assertEquals("Invalid Price!",2.00, price, 0.0);
        Assert.assertEquals("Incorrect name", "Pantene", name);
        Assert.assertEquals("Invalid Price!",30.00, discountPrice, 0.0);
    }

    @Test
    public void catalogTest () {
        //Arrange
        Catalog catalogTest = new Catalog("Target");
        String storeName = catalogTest.getStoreName();

        //Act
        Item protein = new Item("Protein", 33.30);
        catalogTest.add(protein);

        Item guitar = new Item("Guitar", 100.00);
        catalogTest.add(guitar);

        Item clothes = new Item("Pants", 30.00);
        catalogTest.add(clothes);

        //Assert
        Assert.assertEquals("Incorrect Item", protein, catalogTest.getItem("Protein"));
        Assert.assertEquals("Incorrect Item", guitar, catalogTest.getItem("Guitar"));
    }



}
