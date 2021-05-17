import java.util.ArrayList;
import java.util.Random;

public class Restaurant {

    private ArrayList<Employee> employees = new ArrayList<>();
    private ArrayList<Product> products = new ArrayList<>();


    public Restaurant() {
        initEmployees();
        initProducts();
    }
    private void initEmployees() {

        addCook("Monica", 100);
        addWaiter("Ross");
        addWaiter("Phobe");
        addWaiter("Rachel");
    }
    private void initProducts() {

        // Parameters for Product Constructor:
        // Product Name, Selling Price, Purchase Price and Utility Cost

        products.add(new MainDish("Pizza", 6, 2, 2));
        products.add(new MainDish("Burger", 5, 1.5, 2));

        products.add(new Beverage("Coke", 2, 0.5));
        products.add(new Beverage("Lemonade", 2, 0.3));

        products.add(new Dessert("Tiramusu", 4, 1, 1));
        products.add(new Dessert("Cake", 3, 0.5, 1));
        products.add(new Dessert("Ice Cream", 3, 0.5, 0.5));

        ArrayList<Product> HGproducts = new ArrayList<>();
        HGproducts.add(new MainDish("Pizza", 6, 2, 2));
        HGproducts.add(new Beverage("Coke", 2, 0.5));
        HGproducts.add(new Dessert("Tiramusu", 4, 1, 1));
        products.add(new MenuProduct("Hunger Games Menu", HGproducts));

        ArrayList<Product> Kidsproducts = new ArrayList<>();
        Kidsproducts.add(new MainDish("Burger", 5, 1.5, 2));
        Kidsproducts.add(new Beverage("Lemonade", 2, 0.3));
        Kidsproducts.add(new Dessert("Ice Cream", 3, 0.5, 0.5));
        products.add(new MenuProduct("Kids Menu", Kidsproducts));
    }
    public void listEmployees(){
        for (int i=0; i<= employees.size()-1;i++){
            System.out.println(employees.get(i).toString());

        }
    }

    public void addCook(String name, double salary){
        employees.add(new Cook(employees.size()+1, name, salary));
    }
    public void addWaiter(String name){
        employees.add(new Waiter(employees.size()+1, name));
    }

    public Waiter assignWaiter(){
        Random random = new Random();
        int i = random.nextInt(employees.size());
        while(true){
            if (employees.get(i) instanceof Waiter){
                return (Waiter) employees.get(i);
            }
        }
    }








}