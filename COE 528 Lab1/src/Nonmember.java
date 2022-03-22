public class Nonmember extends Passenger 
{

    //constructor that initializes instance variables
    public Nonmember(String Name, int Age) 
    {
        super(Name, Age);
    }

    //method that applys a discount to the price based on how old you are
    @Override
    public double applyDiscount(double p) 
    {
        if(this.getAge() > 66)
            return p * 0.90;
        else
            return p;
    }
    
}