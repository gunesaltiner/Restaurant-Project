public abstract class Product implements Expense {

    private String name;
    private double purchasePrice;
    private double sellingPrice;
    private double utilityCost;

    public Product(String name, double sellingPrice, double purchasePrice, double utilityCost){
        this.name=name;
        this.purchasePrice=purchasePrice;
        this.sellingPrice=sellingPrice;
        this.utilityCost=utilityCost;
    }
}
