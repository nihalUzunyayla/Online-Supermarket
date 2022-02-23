
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class GreenGrocer extends Food {

    public GreenGrocer(String vitamin, String herbType, double calorie, String name, String packageType, double quantity, double price) {
        super(calorie, name, packageType, quantity, price);
        this.vitamin = vitamin;
        this.herbType = herbType;
    }

    public GreenGrocer(String name,Double price,int numberOfProduct){
        super(name, price, numberOfProduct);
    }
    
    private String vitamin;
    private String herbType;

    public String getHerbType() {
        return herbType;
    }

    public void setHerbType(String herbType) {
        this.herbType = herbType;
    }

    public String getVitamin() {
        return vitamin;
    }

    public void setVitamin(String vitamin) {
        this.vitamin = vitamin;
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
        return super.toString() + "\nTime: " + this.consumptionTime() + "\nCondition: " + 
                this.storageCondition() + "\nVitamin: " + vitamin + "\nHerb Type: " + herbType;
    }

    public static ListOperations greenGroList = new ListOperations();
    public static ArrayList<String> firstNames = new ArrayList<String>();
    
    public static void readFromFile() throws FileNotFoundException {
        
        File file = new File("greenGrocer.txt");
        Scanner input = new Scanner(file);
        
     String packageType;
        Double quantity;
        Double price;
        Double calorie;
        String vitamin;
        String herbType;
        
        while(input.hasNext()){
            String name = input.next();
            firstNames.add(name);
            String temp = input.next();
            if(temp.equals(",")){
                packageType = input.next();
                quantity = Double.parseDouble(input.next());
                price = Double.parseDouble(input.next());
                calorie = Double.parseDouble(input.next());
                vitamin = input.next();
                herbType = input.next();
            }
            else{
                name = name +" " +temp;
                input.next();
                packageType = input.next();
                quantity = Double.parseDouble(input.next());
                price = Double.parseDouble(input.next());
                calorie = Double.parseDouble(input.next());
                vitamin = input.next();
                herbType = input.next();
            }

           GreenGrocer greengrocer = new GreenGrocer(vitamin, herbType, calorie, name, packageType, quantity, price);
            
            
            greenGroList.addObject(greengrocer);
        }  
        
    }
    
}
