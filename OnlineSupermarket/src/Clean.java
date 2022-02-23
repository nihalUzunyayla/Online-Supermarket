
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Clean extends Product{
    
    private String type;

    public Clean() {
    }

    public Clean(String name, String packageType, double quantity, double price, String type) {
        super(name, packageType, quantity, price);
        this.type = type;
    }

    public Clean(String name,Double price,int numberOfProduct){
        super(name, price, numberOfProduct);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString() + "\nQuantıty(Number/L): " + super.getQuantity() + "\nType: " + type ;
    }

    public static ListOperations cleaningList = new ListOperations();
    public static ArrayList<String> firstNames = new ArrayList<String>();
    
    public static void readFromFile() throws FileNotFoundException {
         
        File file = new File("cleaning.txt");
        Scanner input = new Scanner(file);
        
        String packageType;
        Double quantity;
        Double price;
        String type;
        
        while(input.hasNext()){
            String name = input.next();
            firstNames.add(name);
            String temp = input.next();
            if(temp.equals(",")){
                packageType = input.next();
                quantity = Double.parseDouble(input.next());
                price = Double.parseDouble(input.next());
                type =input.next();
            }
            else{
                name = name +" " +temp;
                input.next();
                packageType = input.next();
                quantity = Double.parseDouble(input.next());
                price = Double.parseDouble(input.next());
                type =input.next();
            }
           
            Clean cleaning = new Clean(name, packageType, quantity, price, type);
            cleaningList.addObject(cleaning);
        }
    }

    @Override
    public String gift() {
        String s = "*YOU HAVE WON A DISH SPONGE  :)\n";
        return s;
    }
    
    

   
    
    
    
}
