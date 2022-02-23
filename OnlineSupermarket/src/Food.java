public abstract class Food extends Product{

    private double calorie;

    public Food() {
    }
    
    public Food(double calorie, String name, String packageType, double quantity, double price) {
        super(name, packageType, quantity, price);
        this.calorie = calorie;
    }

    public Food(String name,Double price,int numberOfProduct){
        super(name, price, numberOfProduct);
    }
   
    
    public double getCalorie() {
        return calorie;
    }

    public void setCalorie(double calorie) {
        this.calorie = calorie;
    }
    
    @Override
    public String gift() {
        String s = "*YOU HAVE WON A LEMONADE  :)\n";
        return s;
    }
    
    public abstract String consumptionTime();
    public abstract String storageCondition();

    @Override
    public String toString() {
        
        return super.toString() + "\nQuantıty(Kg/L): " + super.getQuantity()+ "\nCalorie: " + calorie;
    }
    
    
    
    
    
}
