import java.util.*;

public class FoodCategory extends FoodComponent
{
    private Vector<FoodComponent> FoodCategory;
    public String Category;
    public String Output = "";
    
    public FoodCategory(String Category)
    {
        this.Category = Category;
        this.FoodCategory = new Vector();
    }

    public void add(FoodComponent c) 
    {
        FoodCategory.add(c);
    }

    public void remove(FoodComponent c) 
    {
        if(FoodCategory.size() > 0)
            FoodCategory.remove(c);
    }

    @Override
    public double getPrice() 
    {
        double TotalPrice = 0.0;
        
            for(int i = 0; i < FoodCategory.size(); i++)
            {
                TotalPrice = FoodCategory.get(i).getPrice() + TotalPrice;
            }
            
            return TotalPrice;
    }

    @Override
    public void print(int level) 
    {
        for(int i = 0; i < level; i++)
            {
                System.out.print("     ");
            }
                System.out.println(this);
                
                for(int j = 0; j < FoodCategory.size(); j++)
                {
                    FoodCategory.get(j).print(level+1);
                }
    }
    
    @Override
    public String toString()
    {
        Output += "FoodCategory (" + Category + ", "+ this.getPrice()
                + ") contains";
        return Output;
    }
    
}