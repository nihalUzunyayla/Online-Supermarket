
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Chicken extends WhiteMeat implements InutritiveValue {

    public Chicken(double calorie, String name, String packageType, double quantity, double price) {
        super(calorie, name, packageType, quantity, price);
    }
    
    public Chicken(String name,Double price,int numberOfProduct){
        super(name, price, numberOfProduct);
    }
    
    @Override
    public double proteinRatio() {
        return getQuantity()*(0.27);
    }

    @Override
    public double fatRatio() {
        return getQuantity()*(0.14);
    }
    
    
     @Override
    public String toString() {
        return super.toString() + "\nProtein Ratio: " +
               String.format("%.2f", this.proteinRatio())  + "\nFat Ratio: " + String.format("%.2f", this.fatRatio());
    }
    
    public static ListOperations chickenList = new ListOperations();
    public static ArrayList<String> firstNames = new ArrayList<String>();
    
    public static void readFromFile() throws FileNotFoundException {
        
        File file = new File("chicken.txt");
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
            
            Chicken chicken = new Chicken(calorie, name, packageType, quantity, price);
          
            chickenList.addObject(chicken);
        }
    }
}
