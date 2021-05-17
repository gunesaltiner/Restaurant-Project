import java.util.ArrayList;

public class Order {

    public ArrayList<Product> orderproducts = new ArrayList<>();

    public Order(){

    }

    public void addProduct(Product product){
        orderproducts.add(product);
    }



}
