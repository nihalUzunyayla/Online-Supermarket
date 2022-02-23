public class WhiteMeat extends MeatProducts{

    public WhiteMeat(double calorie, String name, String packageType, double quantity, double price) {
        super(calorie, name, packageType, quantity, price);
    }
    
    public WhiteMeat(String name,Double price,int numberOfProduct){
        super(name, price, numberOfProduct);
    }
    
    @Override
    public String consumptionTime() {
        return "Consume within a week.";
    }

    @Override
    public String toString() {
        return super.toString() + "\nTime: " + this.consumptionTime();
    }
}
