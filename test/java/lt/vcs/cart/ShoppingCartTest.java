package lt.vcs.cart;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class ShoppingCartTest {

    ShoppingCart shoppingCart;

    @Before
    public void setUp() {
        //given
        shoppingCart = new ShoppingCart();
    }

    @Test
    public void givenShoppingCart_whenAddingItem_thenShopingCartItemsSizeIsOne() {
        //when
        shoppingCart.add("Batonas");
        //then
        assertEquals("Size should be 1", 1, shoppingCart.getTotalItems());
    }

    @Test(expected = IllegalStateException.class)
    public void givenEmptyShoppingCart_whenCheckingIfItemExists_thenExceptionIsThrown() {
        //when
        shoppingCart.doesContain("Batonas");
    }

    @Test
    public void givenShoppingCartWithMilkBreadBanana_whenCountingTotal_then2IsReturned() {
        //given
        shoppingCart.add("Banana");
        shoppingCart.add("Bread");
        shoppingCart.add("Milk");
        //then
        Assert.assertEquals(2.0, shoppingCart.checkout(), 0.0001);
    }

    @Test
    public void givenShoppingCart_whenCleaningItemsList_thenItemListSizeIs0() {
        //given
        shoppingCart.add("Milk");
        //then
        shoppingCart.cleanItems();
        //then
        Assert.assertEquals(0, shoppingCart.getTotalItems());
    }
}