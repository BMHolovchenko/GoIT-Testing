import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class CalculatorTest {

    private final Calculator calculator = new Calculator ();
    private List <Product> products;

    {
        try {
            products = new PriceList ().readPrices ();
        } catch (IOException e) {
            e.printStackTrace ();
        }
    }

    @Test
    public void productsPriceCountTest() {
        Assert.assertEquals (0.0, calculator.calculateTotalCost ("tuityutjryu",products),0);
    }

    @Test
    public void nullableProductsTest() {
        Assert.assertEquals(0.0, calculator.calculateTotalCost(null,null),0);
        Assert.assertEquals(0.0, calculator.calculateTotalCost("",null),0);
        Assert.assertEquals(0.0, calculator.calculateTotalCost(null,products),0);
        Assert.assertEquals(0.0, calculator.calculateTotalCost("",products),0);
    }
}