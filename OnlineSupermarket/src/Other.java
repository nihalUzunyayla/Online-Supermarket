
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Other extends Product{
   
    private String usageTime;

    public Other() {
    }
    
    public Other( String name, String packageType, double quantity, double price, String usageTime) {
        super(name, packageType, quantity, price);
        this.usageTime = usageTime;
    }

    public Other(String name,Double price,int numberOfProduct){
        super(name, price, numberOfProduct);
    }

    public String getUsageTime() {
        return usageTime;
    }

    public void setUsageTime(String usageNumber) {
        this.usageTime = usageNumber;
    }

    @Override
    public String toString() {
        return super.toString() + "\nQuantıty(Number): " + (int)super.getQuantity()+ "\nUsage Number: " + usageTime;
    }

    public static ListOperations otherList = new ListOperations();
    public static ArrayList<String> firstNames = new ArrayList<String>();
    
    public static void readFromFile() throws FileNotFoundException {
        File file = new File("other.txt");
        Scanner input = new Scanner(file);
        
        String packageType;
        Double quantity;
        Double price;
        String usageTime;
        
        while(input.hasNext()){
            String name = input.next();
            firstNames.add(name);
            String temp = input.next();
            if(temp.equals(",")){
                packageType = input.next();
                quantity = Double.parseDouble(input.next());
                price = Double.parseDouble(input.next());
                usageTime =input.next();
            }
            else{
                name = name +" " +temp;
                input.next();
                packageType = input.next();
                quantity = Double.parseDouble(input.next());
                price = Double.parseDouble(input.next());
                usageTime =input.next();
            }
            
            Other other = new Other( name, packageType, quantity, price, usageTime);
            
            otherList.addObject(other);
        }
    }

    @Override
    public String gift() {
        String s = "*YOU HAVE WON A GLASS  :)\n";
        return s;
    }
    
    
    
    
}
