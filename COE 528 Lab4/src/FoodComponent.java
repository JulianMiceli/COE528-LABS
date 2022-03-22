import java.util.*;

public abstract class FoodComponent 
{
    public FoodComponent()
    {
        
    }
    
    abstract double getPrice();
    
    abstract void print(int level);
}