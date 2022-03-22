public class Member extends Passenger
{
    //instance variables
    int yearsOfMembership;
    
        //constructor that initializes instance variables
        public Member(int yearsOfMembership, String Name, int Age) 
        {
            super(Name, Age);
            this.yearsOfMembership = yearsOfMembership;
        }
        
        //set the years of the membership
        public void setyearsOfMembership(int yearsOfMembership)
        {
            this.yearsOfMembership = yearsOfMembership;
        }
        
        //get the years of the memebership
        public int getyearsOfMembership()
        {
            return yearsOfMembership;
        }

        //method that applys a discount to the price based on how many years
        //you have been a memeber for
        @Override
        public double applyDiscount(double p) 
        {
            if(yearsOfMembership > 5)
                return p * 0.50;
            else if(yearsOfMembership > 1)
                return p * 0.90;
            else
                return p;
        }
    
}