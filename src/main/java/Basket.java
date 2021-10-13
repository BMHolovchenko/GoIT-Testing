import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Basket {

    public Map<String,Integer> basketPriceCount(String price) {
        Map<String,Integer> priceConverter = new HashMap<> ();
        if (price == null) {
            price = "";
            System.out.println("There are no products in your basket. Please, make order.");
        }
        String[] products = price.toUpperCase().trim().split("");
        Arrays.sort(products);
        String comparingUnit = products[0];
        int count = 0;
        for (int i = 0; i < products.length; i++) {
            if (comparingUnit.equals(products[i])) {
                count++;
                if (i == products.length - 1) {
                    priceConverter.put(comparingUnit,count);
                }
            }
            else {
                priceConverter.put(comparingUnit,count);
                comparingUnit = products[i];
                count = 1;
                if (i == products.length - 1) {
                    priceConverter.put(comparingUnit,count);
                }
            }
        }


        return priceConverter;
    }
}
