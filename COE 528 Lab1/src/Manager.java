import java.util.*;

public class Manager 
{
    //instance variables
    Scanner scan = new Scanner(System.in);
    int numberOfFlights;
    static List<Flight> flights = new ArrayList<Flight>();
    static List<Ticket> tickets = new ArrayList<Ticket>();
    static int flightNumber = 1;
    
        //method that returns the departure time of each flight
        public static String newDepartureTime(int month, int day, int year, 
                int hour, int minute, String AMorPM)
        {
            return month + "/" + day + "/" + year + ", " + hour + ":" + minute 
                    + AMorPM;
        }
    
        //method that creates the flights
        //asks the user for how many flights they want to create while at the
        //same time trys to catch an illegal argument exception based on input
        //after this, it asks the user to fill in the required info of the n 
        //number of flights they created
        public void createFlights()
        {   
            System.out.println("How many Flights would you like to create?");
            
            while(true)
            {
                try
                {
                    numberOfFlights = scan.nextInt();
                    break;
                }
                catch(IllegalArgumentException e)
                {
                    System.out.println("Incorrect data type inputted");
                }
            }
            
                for(int i = 0; i < numberOfFlights; i++)
                {
                    int flightNumber, flightCapacity;
                    String Destination, Origin, DateandTime;
                    double Price;
                    
                    System.out.println("Enter the flight number");
                    
                    while(true)
                    {
                        try
                        {
                            flightNumber = scan.nextInt();
                            scan.nextLine();
                            break;
                        }
                        catch(IllegalArgumentException e)
                        {
                            System.out.println("No real number inputted");
                        }
                    }
                    
                    System.out.println("Enter the origin.");
                    Origin = scan.nextLine();
                    
                    System.out.println("Enter the Destination Location.");
                    Destination = scan.nextLine();

                    System.out.println("Enter the Date and Time of the flight."
                            + "Format: MM/DD/YY Time:AM/PM");
                    DateandTime = scan.nextLine();
                    
                    System.out.println("Enter the maximum capacity of the flight.");
                    flightCapacity = scan.nextInt();
                    
                    System.out.println("Enter the price.");
                    Price = scan.nextDouble();

                    Flight createFlight = new Flight(flightNumber, Origin, 
                            Destination, DateandTime, flightCapacity, Price);
                    flights.add(createFlight);
                }
        }
        
        //method that displays the available flights, uses a for each loop
        //to display flights array and checks if the origin and destination 
        //inputted are the same
        public void displayAvailableFlights(String Origin, String Destination)
        {
            for(Flight flight : flights)
            {
                if(flight.getDestination().equals(Destination) 
                        && flight.getOrigin().equals(Origin))
                {
                    System.out.println(flight.toString());
                }
            }
        }
        
        //method that gets the flight based on the flight number
        //uses a for loop to retrieve the flights in the array, and uses an if
        //statement to check if the flightnumber in the array is the same as the
        //one passed into the method
        public Flight getFlight(int flightNumber)
        {
            Flight getFlight = null;
            
            for(int i = 0; i < flights.size(); i++)
            {
                if(flights.get(i).getFlightNumber() == flightNumber)
                {
                    getFlight = flights.get(i);
                }
            }
            return getFlight;
        }
        
        //method to book a seat
        //uses an if statement to try and book a seat, if it is sucessful it
        //adds the persons ticket to the ticket array
        public void bookSeat(int flightNumber, Passenger P)
        {
            Flight flight = getFlight(this.flightNumber);
            Ticket newTicket = new Ticket(P, flight);
            
            if(flight != null)
            {
                if(flight.BookASeat())
                {
                    tickets.add(newTicket);
                }
            }
        }
        
        //main method
        public static void main(String[] args)
        {
            //declared variables
            Manager Manage = new Manager();
            Manage.createFlights();
            String Origin, Destination;
            
            //for loop that goes through the flight array to display all the user
            //inputted flights
            for(int i = 0; i < flights.size(); i++)
            {
                Origin = flights.get(i).getOrigin();
                Destination = flights.get(i).getDestination();
                System.out.println("List of available flights from " + Origin + " to " + Destination);
                Manage.displayAvailableFlights(Origin, Destination);
                System.out.println("\n");
            }
            
            //passenger class references
            Passenger PassNumOne = new Member(6, "Cherry", 54);
            Passenger PassNumTwo = new Nonmember("Drake", 68);
            
            //books seats bassed on passenger class reference data
            Manage.bookSeat(1829, PassNumOne);
            Manage.bookSeat(9182, PassNumTwo);
            
            //for each loop that displays passengers tickets
            for(Ticket ticket: tickets)
            {
                System.out.println(ticket);
                System.out.println("\n");
            }
            
            //Test Passenger class
            Passenger PassTestOne = new Member(4, "Nick", 47);
            System.out.println("Passenger Test One Name: "+ PassTestOne.getName());
            System.out.println("Passenger Test One Age: "+ PassTestOne.getAge());
            System.out.println("Passenger Test One Membership Price: "+ PassTestOne.applyDiscount(1000.00));
            System.out.println("\n");
            
            Passenger PassTestTwo = new Nonmember("Martina", 35);
            System.out.println("Passenger Test Two Name: "+ PassTestTwo.getName());
            System.out.println("Passenger Test Two Age: "+ PassTestTwo.getAge());
            System.out.println("Passenger Test Two Nonmember Price: "+ PassTestTwo.applyDiscount(1000.00));
            System.out.println("\n");
            
            //Test Ticket Class
            Ticket TicketTestOne = new Ticket(PassTestOne, flights.get(0));
            TicketTestOne.setPrice();
            System.out.println("Ticket Passenger Details: "+ TicketTestOne.getPassenger());
            System.out.println("Ticket Flight Details: "+ TicketTestOne.getFlight());
            System.out.println("Ticket Price: "+ TicketTestOne.getPrice());
        }
}