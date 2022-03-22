public class Ticket 
{
    //instance variables
    Passenger passenger;
    Flight flight;
    double Price;
    int Number;
    static int ticketNumber = 1;
    
        //constructor the initialize instance variables
        public Ticket(Passenger p, Flight f)
        {
            this.passenger = p;
            this.flight = f;
            this.Number = ticketNumber++;        
        }
        
        //set the passengers
        public void setPassenger(Passenger p)
        {
            this.passenger = p;
        }
        
        //set the flight
        public void setFlight(Flight f)
        {
            this.flight = f;
        }
        
        //get the passengers
        public Passenger getPassenger()
        {
            return this.passenger;
        }
        
        //get the flight
        public Flight getFlight()
        {
            return this.flight;
        }
        
        //set the price
        public void setPrice()
        {
            double discountPrice = 
                    passenger.applyDiscount(flight.getoriginalPrice());
            this.Price = discountPrice;
        }
        
        //get the price
        public double getPrice()
        {
            return Price;
        }
        
        //method that displays the instance variables
        @Override
        public String toString()
        {
            return passenger.getName() + ", " + flight.toString() + 
                    ", Ticket Price: $ " + Price;
                    
        }
    
}