
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DairyProducts extends Food{

    public DairyProducts(double calorie, String name, String packageType, double quantity, double price) {
        super(calorie, name, packageType, quantity, price);
    }

    public DairyProducts(String name,Double price,int numberOfProduct){
        super(name, price, numberOfProduct);
    }
    
    
    @Override
    public String consumptionTime() {
        return "Consume within a week.";
    }

    @Override
    public String storageCondition() {
        return "Store in the refrigerator.";
    }

    @Override
    public String toString() {
        return super.toString() + "\nTime: " + this.consumptionTime() + "\nCondition: " + this.storageCondition();
    }

    public static ListOperations dairyList = new ListOperations();
    public static ArrayList<String> firstNames = new ArrayList<String>();
    
    public static void readFromFile() throws FileNotFoundException {
        
        File file = new File("dairy.txt");
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
            
            DairyProducts dairyFood = new DairyProducts(calorie, name, packageType, quantity, price);
                      
            dairyList.addObject(dairyFood);
        }
    }
   
    
    
    
    
}
