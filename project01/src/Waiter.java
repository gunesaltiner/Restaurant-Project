import java.util.ArrayList;

public class Waiter extends Employee {

    private double orderRate;
    private ArrayList<Order> order= new ArrayList<>();


    public Waiter (int id, String name){
        super(id, name);
        this.orderRate=0.1;
    }


}
