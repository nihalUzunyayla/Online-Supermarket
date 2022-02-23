public class RedMeat extends MeatProducts{

    public RedMeat(double calorie, String name, String packageType, double quantity, double price) {
        super(calorie, name, packageType, quantity, price);
    }
    
    public RedMeat(String name,Double price,int numberOfProduct){
        super(name, price, numberOfProduct);
    }
  
    @Override
    public String consumptionTime() {
        return "Consume within a month.";
    }

     @Override
    public String toString() {
        return super.toString() + "\nTime: " + this.consumptionTime();
    }
  
    
}
