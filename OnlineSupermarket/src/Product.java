
import java.io.FileNotFoundException;

public abstract class Product {
    
    private String name;
    private String packageType;
    private double quantity;
    public int numberOfProduct;
    protected double price;
    public static double totalPrice=0;
    public static double discountedPrice;
    
    
    public Product() {
    }

    
    public Product(String name, double price, int numberOfProduct) {
        this.name = name;
        this.numberOfProduct = numberOfProduct;
        this.price = price;
    }
    
    public Product(String name, String packageType, double quantity, double price) {
        this.name = name;
        this.packageType = packageType;
        this.quantity = quantity;
        this.price = price;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPackageType() {
        return packageType;
    }

    public void setPackageType(String packageType) {
        this.packageType = packageType;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
    
    public static double discount(){
            if(totalPrice < 50){
            discountedPrice = totalPrice;
            }
            else if(totalPrice >= 50 && totalPrice < 100 ){
                discountedPrice = totalPrice-(totalPrice-50)*0.05;
            }
            else if(Product.totalPrice >= 100){
                discountedPrice = 50 + (50-50*0.05) + (totalPrice-100)-(totalPrice-100)*0.03;  
            }
        return discountedPrice;
    }
    
    public abstract String gift();

    @Override
    public String toString() {
        return "Name: " + name + "\nPackage Type: " + packageType + "\nPrice:" + price;
    }
    
    
        
}
