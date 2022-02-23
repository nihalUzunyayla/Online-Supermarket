
import java.io.FileNotFoundException;

public class MeatProducts extends Food {

    public MeatProducts(double calorie, String name, String packageType, double quantity, double price) {
        super(calorie, name, packageType, quantity, price);
    }

    public MeatProducts(String name,Double price,int numberOfProduct){
        super(name, price, numberOfProduct);
    }
 
    @Override
    public String storageCondition() {
        return "Store in the freezer.";
    }

    @Override
    public String consumptionTime() {
        return null;
                
    }
    
     @Override
    public String toString() {
        return super.toString() + "\nCondition: " + this.storageCondition();
    }

    
}
