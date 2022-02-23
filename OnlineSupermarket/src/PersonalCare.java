
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalCare extends Product{
    
    private String usageAim;

    public PersonalCare() {
    }
    
    public PersonalCare(String name, String packageType, double quantity, double price, String usageAim) {
        super(name, packageType, quantity, price);
        this.usageAim = usageAim;
    }

    public PersonalCare(String name,Double price,int numberOfProduct){
        super(name, price, numberOfProduct);
    }

    public String getUsageAim() {
        return usageAim;
    }

    public void setUsageAim(String usageAim) {
        this.usageAim = usageAim;
    }

    @Override
    public String toString() {
        return super.toString() +"\nQuantıty(Number/L): " + super.getQuantity()+ "\nUsage Aim: " + usageAim ;
    }

    public static ListOperations careList = new ListOperations();
    public static ArrayList<String> firstNames = new ArrayList<String>();
    
    public static void readFromFile() throws FileNotFoundException {
        File file = new File("personalCare.txt");
        Scanner input = new Scanner(file);
        
        String packageType;
        Double quantity;
        Double price;
        String usageAim;
        
        while(input.hasNext()){
            String name = input.next();
            firstNames.add(name);
            String temp = input.next();
            if(temp.equals(",")){
                packageType = input.next();
                quantity = Double.parseDouble(input.next());
                price = Double.parseDouble(input.next());
                usageAim =input.next();
            }
            else{
                name = name +" " +temp;
                input.next();
                packageType = input.next();
                quantity = Double.parseDouble(input.next());
                price = Double.parseDouble(input.next());
                usageAim =input.next();
            }
           
            PersonalCare care = new PersonalCare( name, packageType, quantity, price, usageAim);
            
            
            careList.addObject(care);
        }
    }

    @Override
    public String gift() {
        String s = "*YOU HAVE WON A COMB  :)\n";
        return s;
    }
    
    
}
