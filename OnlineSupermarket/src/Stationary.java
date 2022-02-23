
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Stationary extends Product{

    private String rawMaterial;

    public Stationary() {
    }

    public Stationary(String name, String packageType, double quantity, double price, String rawMaterial) {
        super(name, packageType, quantity, price);
        this.rawMaterial = rawMaterial;
    }
    
    public Stationary(String name,Double price,int numberOfProduct){
        super(name, price, numberOfProduct);
    }

   
    public String getRawMaterial() {
        return rawMaterial;
    }

    public void setRawMaterial(String rawMaterial) {
        this.rawMaterial = rawMaterial;
    }

    @Override
    public String toString() {
        return super.toString() +"\nQuantıty(Number): " + (int)super.getQuantity()+ "\nRaw Material: " + rawMaterial ;
    }

    public static ListOperations stationaryList = new ListOperations();
    public static ArrayList<String> firstNames = new ArrayList<String>();
    
    public static void readFromFile() throws FileNotFoundException {
        File file = new File("stationary.txt");
        Scanner input = new Scanner(file);
        
        String packageType;
        Double quantity;
        Double price;
        String rawMaterial;
        
        while(input.hasNext()){
            String name = input.next();
            firstNames.add(name);
            String temp = input.next();
            if(temp.equals(",")){
                packageType = input.next();
                quantity = Double.parseDouble(input.next());
                price = Double.parseDouble(input.next());
                rawMaterial = input.next();
            }
            else{
                name = name +" " +temp;
                input.next();
                packageType = input.next();
                quantity = Double.parseDouble(input.next());
                price = Double.parseDouble(input.next());
                rawMaterial = input.next();
            }

            Stationary stationary = new Stationary( name, packageType, quantity, price, rawMaterial);

            stationaryList.addObject(stationary);
        }
    }

    @Override
    public String gift() {
        String s = "*YOU HAVE WON A NOTEBOOK  :)\n";
        return s;
    }
    
    
    
}
