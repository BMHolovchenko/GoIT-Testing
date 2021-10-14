import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        PriceList priceList = new PriceList();
        List<Product> products = priceList.readPrices();
        System.out.println("Price is " + new Calculator ().calculateTotalCost("ABCDABA",products));
    }
}
