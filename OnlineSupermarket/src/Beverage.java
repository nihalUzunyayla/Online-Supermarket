
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Beverage extends Food {

    public Beverage(double calorie, String name, String packageType, double quantity, double price) {
        super(calorie, name, packageType, quantity, price);
    }

    
    public Beverage(String name,Double price,int numberOfProduct){
        super(name, price, numberOfProduct);
    }

    @Override
    public String consumptionTime() {
        return "Consume within 3 days after\nopening the cap.";
    }

    @Override
    public String storageCondition() {
        return "Store in the refrigerator.";
    }

     @Override
    public String toString() {
        return super.toString() + "\nTime: " + this.consumptionTime() + "\nCondition: " + this.storageCondition();
    }

    public static ListOperations bevList = new ListOperations();
    public static ArrayList<String> firstNames = new ArrayList<String>();
    
    public static void readFromFile() throws FileNotFoundException{
        File file = new File("beverage.txt");
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
            
            
            Beverage beverage = new Beverage(calorie, name, packageType, quantity, price);
            
            
            bevList.addObject(beverage);
            
        }
    }
    
    
    
}
