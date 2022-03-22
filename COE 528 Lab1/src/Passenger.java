public abstract class Passenger 
{
    //instance variables
    String Name;
    int Age;
    
        //constructor to initialize instance variables
        public Passenger(String Name, int Age)
        {
            this.Name = Name;
            this.Age = Age;
        }
        
        //method that applys the discount to the price
        public abstract double applyDiscount(double p);
        
        //set the name
        public void setName(String Name)
        {
            this.Name = Name;
        }
        
        //set the age
        public void setAge(int Age)
        {
            this.Age = Age;
        }
        
        //get the name
        public String getName()
        {
            return Name;
        }
        
        //get the age
        public int getAge()
        {
            return Age;
        }
}