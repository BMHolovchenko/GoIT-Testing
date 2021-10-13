import java.io.IOException;
import java.util.List;
import java.util.Map;

public class Calculator {

    public Double calculateTotalCost(String costs, List<Product> products) {
        double cost = 0.00D;
        Basket basket = new Basket();
        Map<String,Integer> priceConverter = basket.basketPriceCount(costs);
        if (products == null) {
            System.out.println("There are no products in your basket. Please, make order.");
            return cost;
        }
        for (Product product: products) {
            if (priceConverter.get(product.getName()) == null)
                continue;
            int count = priceConverter.get(product.getName());

            int discountedQuantity = product.getDiscountedQuantity();
            Double price = product.getPrice();
            Double specialOffer = product.getSpecialOffer();

            if (discountedQuantity >= 1) {
                cost += (specialOffer * (count / discountedQuantity) + price * (count % discountedQuantity));
            }
            else cost += price * count;
        }

        return cost;
    }

    public static void main(String[] args) throws IOException {
        PriceList priceList = new PriceList();
        List<Product> products = priceList.readPrices();
        System.out.println("Price is " + new Calculator ().calculateTotalCost("ABCDABA",products));

    }

}