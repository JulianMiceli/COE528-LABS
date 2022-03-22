import java.util.*;

public class Flight 
{
    //instance variables
    int flightNumber;
    String Origin;
    String Destination;
    String departureTime;
    int Capacity;
    int numberOfSeatsLeft;
    double originalPrice;
    
        //Constructor that initializes instance variables
        public Flight(int FlightNumber, String Origin, String Destination, 
                String departureTime, int Capacity, double originalPrice)
        {
            try
            {
                if(Origin.equals(Destination))
                {
                    throw new IllegalArgumentException("Origin cannot be the same as the destination");
                }
                else
                {
                    this.flightNumber = FlightNumber;
                    this.Origin = Origin;
                    this.Destination = Destination;
                    this.departureTime = departureTime;
                    this.Capacity = Capacity;
                    this.numberOfSeatsLeft = Capacity;
                    this.originalPrice = originalPrice;
                }
            }
            catch(IllegalArgumentException e)
            {
                System.out.println(e);
            }
        }
        
        //set the flight number
        public void setFlightNumber(int flightNumber)
        {
            this.flightNumber = flightNumber;
        }
        
        //set the origin, also check to see if origin and destination are the
        //same. If they are throw an illegal argument exception
        public void setOrigin(String Origin)
        {
            try
            {
                if(Origin.equals(this.Destination))
                {
                    throw new IllegalArgumentException("Origin cannot be the same as the destination");
                }
                else
                {
                    this.Origin = Origin;
                }
            }
            catch(IllegalArgumentException e)
            {
                System.out.println(e);
            }
        }
        
        //set the destination, also check to see if origin and destination are the
        //same. If they are throw an illegal argument exception
        public void setDestination(String Destination)
        {
            try
            {
                if(Destination.equals(this.Origin))
                {
                    throw new IllegalArgumentException("Origin cannot be the same as the destination");
                }
                else
                {
                    this.Destination = Destination;
                }
            }
            catch(IllegalArgumentException e)
            {
                System.out.println(e);
            }
        }
        
        //set the departure time
        public void setdepartureTime(String departureTime)
        {
            this.departureTime = departureTime;
        }
        
        //set the capacity
        public void setCapacity(int Capacity)
        {
             this.Capacity = Capacity;
        }
        
        //set the number of seats left
        public void setnumberOfSeatsLeft(int numberOfSeatsLeft)
        {
            this.numberOfSeatsLeft = numberOfSeatsLeft;
        }

        //set the original price
        public void setoriginalPrice(double originalPrice)
        {
            this.originalPrice = originalPrice;
        }
        
        //get the flight number
        public int getFlightNumber()
        {
            return flightNumber;
        }
        
        //get the origin
        public String getOrigin()
        {
            return Origin;
        }
        
        //get the destination
        public String getDestination()
        {
            return Destination;
        }
        
        //get the departure time
        public String getdepartureTime()
        {
            return departureTime;
        }
        
        //get the capacity
        public int getCapacity()
        {
            return Capacity;
        }
        
        //get the number of seats left
        public int getnumberOfSeatsLeft()
        {
            return numberOfSeatsLeft;
        }
        
        //get the original price
        public double getoriginalPrice()
        {
            return originalPrice;
        }
        
        //method that checks to see if their are seats available, if their is
        //it deducts one from the available seats to simulate the seat being
        //booked
        public boolean BookASeat()
        {
            if(numberOfSeatsLeft > 0)
            {
                numberOfSeatsLeft--;
                return true;
            }
            else
            {
                return false;
            }
        }
        
        //method that displays all instance variables
        @Override
        public String toString()
        {
            return "Flight " + flightNumber + ", " + Origin + ", " + Destination 
                    + ", " + departureTime + ", Original Price: $" + originalPrice;
        }
    
}