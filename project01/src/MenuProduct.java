import java.util.ArrayList;

public class MenuProduct extends Product{
    private ArrayList<Product> product = new ArrayList<>();

    public MenuProduct(String name, ArrayList<Product> product){
        super(name);
        this.product=product;
        setSellingPrice(calculateSellingPrice());
    }
    public double calculateExpense(){
        double total=0;
        for (int i=0; i<=product.size()-1 ; i++){
            total=total+product.get(i).calculateExpense();
        }
        return total;
    }

}
