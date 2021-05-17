import java.util.ArrayList;

public class MenuProduct extends Product{
    private ArrayList<Product> product = new ArrayList<>();

    public MenuProduct(String name, ArrayList<Product> product){
        super(name);
        this.product=product;
        setSellingPrice(calculateSellingPrice());
    }
}
