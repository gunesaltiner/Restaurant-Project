import java.util.ArrayList;

public class Order {

    public ArrayList<Product> orderproducts = new ArrayList<>();

    public Order(){

    }

    public void addProduct(Product product){
        orderproducts.add(product);
    }

    public void listOrder(){
        if (orderproducts.isEmpty()) {
            System.out.println("You have not ordered anything yet!");
        }else{
            for (int i = 0; i<= orderproducts.size()-1 ; i++) {
                System.out.println(orderproducts.get(i).toString());
            } } }



    public ArrayList<Product> getOrderedProducts(){
        return orderproducts;
    }



    public double calculateTotalPrice(){
        double x=0;

        for (int i = 0; i<= orderproducts.size()-1 ; i++){
            x=x+ orderproducts.get(i).getSellingPrice();
        }
        return x ;
    }

}
