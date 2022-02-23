
import java.util.ArrayList;

public class ListOperations {
    
    public static int index;
    
    public ArrayList <Product> list = new ArrayList<>();

    public ArrayList<Product> getList() {
        return list;
    }
    
    public void addObject(Product pro){
        list.add(pro);
    }
    
    public boolean search(String name){
        for(int i=0; i<list.size(); i++){
            if(name.equalsIgnoreCase(list.get(i).getName())){
                index =i;
                return true;
            }
        }
        return false;
    }
    
    public void delete(){

        if(list.get(list.size()-1).numberOfProduct>1){
            list.get(list.size()-1).numberOfProduct--;
        }
        else if(list.get(list.size()-1).numberOfProduct==1){
            list.get(list.size()-1).numberOfProduct=0;
            list.remove(list.size()-1);
        }
       
    }
    
    public String display(){
         String output="";
         
         for(int i=0; i<list.size(); i++){

            output = output +"* " + list.get(i).getName()+"\n"+ list.get(i).price+"₺\t          x"+ 
                    list.get(i).numberOfProduct + "\t" + (list.get(i).price)*(list.get(i).numberOfProduct)+"₺\n\n";
                        
            Product.totalPrice += (list.get(i).price)*(list.get(i).numberOfProduct);
         }

        return output;
    }
    
    
}
