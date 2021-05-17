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
    private double calculateSellingPrice(){
        double x=0;

        for (int i=0; i<= product.size()-1 ;i++){

            if (product.get(i) instanceof MainDish){
                x=x+ (product.get(i).getSellingPrice()*9/10);

            }if (product.get(i) instanceof Dessert){
                x=x+ (product.get(i).getSellingPrice()*8/10);

            }if (product.get(i) instanceof Beverage){
                x=x+ (product.get(i).getSellingPrice()/2);
            }
        }

        return x;
    }
}
