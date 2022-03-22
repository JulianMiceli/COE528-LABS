import java.util.*;

public class FoodItem extends FoodComponent
{
    private String Name = "";
    private Double Price;
    private String Output = "";
    
        public FoodItem(String Name, Double Price)
        {
            this.Name = Name;
            this.Price = Price;
        }
    
        @Override
        public double getPrice() 
        {
            return Price;
        }
        
        @Override
        public void print(int level) 
        {
            for(int i = 0; i < level; i++)
            {
                System.out.print("     ");
            }
                System.out.println(this);
        }
        
        @Override
        public String toString()
        {
            Output += "Fooditem: " + Name + ", " + Price;
            return Output;
        }
}
    
