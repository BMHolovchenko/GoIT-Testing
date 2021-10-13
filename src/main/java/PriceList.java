import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class PriceList {

    String url = "src/main/resources/PriceList.json";
    public List<Product> readPrices() throws IOException {
        Type productType = new TypeToken<ArrayList<Product>> (){}.getType();
        Gson gson = new Gson();
        return gson.fromJson(new String(Files.readAllBytes(Paths.get(url))),productType);
    }
}