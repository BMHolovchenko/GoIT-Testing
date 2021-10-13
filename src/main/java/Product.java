import com.google.gson.annotations.SerializedName;
import lombok.NonNull;

@NonNull
public class Product {

    @SerializedName("name")
    private final String name;
    @SerializedName("price")
    private final Double price;
    @SerializedName("specialOffer")
    private Double specialOffer;
    @SerializedName("discountedQuantity")
    private final int discountedQuantity;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
        this.discountedQuantity = 0;
    }

    public Product(String name, Double price, Double specialOffer , int discountedQuantity) {
        this.name = name;
        this.price = price;
        this.specialOffer = specialOffer;
        this.discountedQuantity = discountedQuantity;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public Double getSpecialOffer() {
        return specialOffer;
    }

    public int getDiscountedQuantity() {
        return discountedQuantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", specialOffer=" + specialOffer +
                ", discountedQuantity=" + discountedQuantity +
                '}';
    }
}