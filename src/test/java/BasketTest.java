import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.HashMap;
import java.util.Map;

public class BasketTest {

    @Test
    public void nullableBasketTest() {
        Basket basket = Mockito.mock (Basket.class);
        Mockito.when (basket.basketPriceCount ("")).thenReturn (new HashMap<> ());
        Assert.assertNotNull (basket.basketPriceCount (""));
    }

    @Test
    public void productAQuantityTest() {
        Basket basket = new Basket ();
        Map<String, Integer> priceConverter = new HashMap<> ();
        priceConverter.put ("A", 4);
        priceConverter.put ("B", 3);
        priceConverter.put ("C", 1);
        priceConverter.put ("D", 2);
        Assert.assertEquals (priceConverter.get ("A"), basket.basketPriceCount ("aaaabbcbdd").get ("A"));
        Assert.assertEquals (priceConverter.get ("B"), basket.basketPriceCount ("aaaabbcbdd").get ("B"));
        Assert.assertEquals (priceConverter.get ("C"), basket.basketPriceCount ("aaaabbcbdd").get ("C"));
        Assert.assertEquals (priceConverter.get ("D"), basket.basketPriceCount ("aaaabbcbdd").get ("D"));
    }
}