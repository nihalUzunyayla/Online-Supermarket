
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class OtherFood extends Food{

    public OtherFood(double calorie, String name, String packageType, double quantity, double price) {
        super(calorie, name, packageType, quantity, price);
    }

    public OtherFood(String name,Double price,int numberOfProduct){
        super(name, price, numberOfProduct);
    }
    
    @Override
    public String consumptionTime() {
        return "Long term consumption.";
    }

    @Override
    public String storageCondition() {
        return "Store at room temperature.";
    }
    
     @Override
    public String toString() {
        return super.toString() + "\nTime: " + this.consumptionTime() + "\nCondition: " + this.storageCondition();
    }

    public static ListOperations othFoodList = new ListOperations();
    public static ArrayList<String> firstNames = new ArrayList<String>();
    
    public static void readFromFile() throws FileNotFoundException {
        
        File file = new File("otherFoods.txt");
        Scanner input = new Scanner(file);
        
        String packageType;
        Double quantity;
        Double price;
        Double calorie;
        
        while(input.hasNext()){
            String name = input.next();
            firstNames.add(name);
            String temp = input.next();
            if(temp.equals(",")){
                packageType = input.next();
                quantity = Double.parseDouble(input.next());
                price = Double.parseDouble(input.next());
                calorie = Double.parseDouble(input.next());
            }
            else{
                name = name +" " +temp;
                input.next();
                packageType = input.next();
                quantity = Double.parseDouble(input.next());
                price = Double.parseDouble(input.next());
                calorie = Double.parseDouble(input.next());
            }
            
            OtherFood otherFood = new OtherFood(calorie, name, packageType, quantity, price);
            
            othFoodList.addObject(otherFood);
            
        }
    }
    
    
    
    
}
