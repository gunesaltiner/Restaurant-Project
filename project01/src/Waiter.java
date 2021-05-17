import java.util.ArrayList;

public class Waiter extends Employee {

    private double orderRate;
    private ArrayList<Order> order= new ArrayList<>();


    public Waiter (int id, String name){
        super(id, name);
        this.orderRate=0.1;
    }
    public double calculateExpense() {
        double exp = 0;

        for (int i = 0; i <= order.size() - 1; i++){
            exp = exp + order.get(i).calculateTotalPrice();
        }
        return exp*orderRate;
    }

    public void createOrder(Order order){
        this.order.add(order);

    }
    public ArrayList<Order> getOrdersReceived(){
        return order;
    }

}
