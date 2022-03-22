import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class FlightTest 
{
    Flight Flight = new Flight(1, "Toronto", "Aruba", "01/30/2021, 6:30 AM", 1000, 1000.00);
    
    @Test
    public void testValidConstructor()
    {
        Flight testValidFlight = new Flight(1, "Toronto", "Aruba", "01/30/2021, 6:30 AM", 1000, 1000.00);
        assertEquals(testValidFlight.getFlightNumber(), Flight.getFlightNumber());
        assertEquals(testValidFlight.getOrigin(), Flight.getOrigin());
        assertEquals(testValidFlight.getDestination(), Flight.getDestination());
        assertEquals(testValidFlight.getdepartureTime(), Flight.getdepartureTime());
        assertEquals(testValidFlight.getCapacity(), Flight.getCapacity());
        assertEquals(testValidFlight.getoriginalPrice(), Flight.getoriginalPrice(), 0.0);
    }
    
    @Test
    public void testInvalidConstructor()
    {
        Flight testInvalidFlight = new Flight(1, "Toronto", "Toronto", "01/30/2021, 6:30 AM", 1000, 1000.00);
        
            try
            {
                System.out.println(testInvalidFlight);
            }
            catch(IllegalArgumentException e)
            {
                System.out.println("Invalid Construcor");
            }

    }
    
    @Test
    public void testSetFlightNumber() 
    {
        Flight testFlightNumber = new Flight(50, "Toronto", "Aruba", "01/30/2021, 6:30 AM", 1000, 1000.00);
        testFlightNumber.setFlightNumber(1);
        assertEquals(testFlightNumber.getFlightNumber(), Flight.getFlightNumber());
    }

    @Test
    public void testSetOrigin() 
    {
        Flight testFlightOrigin = new Flight(50, "Aruba", "Aruba", "01/30/2021, 6:30 AM", 1000, 1000.00);
        testFlightOrigin.setOrigin("Toronto");
        assertEquals(testFlightOrigin.getOrigin(), Flight.getOrigin());
    }

    @Test
    public void testSetDestination() 
    {
        Flight testFlightDest = new Flight(50, "Toronto", "Toronto", "01/30/2021, 6:30 AM", 1000, 1000.00);
        testFlightDest.setDestination("Aruba");
        assertEquals(testFlightDest.getDestination(), Flight.getDestination());
    }

    @Test
    public void testSetdepartureTime() 
    {
        Flight testFlightDep = new Flight(50, "Toronto", "Aruba", "02/31/2021, 6:30 AM", 1000, 1000.00);
        testFlightDep.setdepartureTime("01/30/2021, 6:30 AM");
        assertEquals(testFlightDep.getdepartureTime(), Flight.getdepartureTime());
    }

    @Test
    public void testSetCapacity() 
    {
        Flight testFlightCap = new Flight(50, "Toronto", "Aruba", "02/31/2021, 6:30 AM", 10000, 1000.00);
        testFlightCap.setCapacity(1000);
        assertEquals(testFlightCap.getCapacity(), Flight.getCapacity());
    }

    @Test
    public void testSetnumberOfSeatsLeft() 
    {
        Flight testFlightNumof = new Flight(50, "Aruba", "Aruba", "01/30/2021, 6:30 AM", 10000, 1000.00);
        testFlightNumof.setnumberOfSeatsLeft(1000);
        assertEquals(testFlightNumof.getnumberOfSeatsLeft(), 1000);
    }

    @Test
    public void testSetoriginalPrice() 
    {
        Flight testFlightPrice = new Flight(50, "Aruba", "Aruba", "01/30/2021, 6:30 AM", 1000, 10000.00);
        testFlightPrice.setoriginalPrice(1000.00);
        assertEquals(testFlightPrice.getoriginalPrice(), Flight.getoriginalPrice(), 0.0);
    }

    @Test
    public void testGetFlightNumber() 
    {
        Flight testFlightNumber = new Flight(1, "Toronto", "Aruba", "01/30/2021, 6:30 AM", 1000, 1000.00);
        assertEquals(testFlightNumber.getFlightNumber(), Flight.getFlightNumber());
    }

    @Test
    public void testGetOrigin() 
    {
        Flight testFlightOrigin = new Flight(50, "Toronto", "Aruba", "01/30/2021, 6:30 AM", 1000, 1000.00);
        assertEquals(testFlightOrigin.getOrigin(), Flight.getOrigin());
    }

    @Test
    public void testGetDestination() 
    {
        Flight testFlightDest = new Flight(50, "Toronto", "Aruba", "01/30/2021, 6:30 AM", 1000, 1000.00);
        assertEquals(testFlightDest.getDestination(), Flight.getDestination());
    }

    @Test
    public void testGetdepartureTime() 
    {
        Flight testFlightDep = new Flight(50, "Toronto", "Aruba", "01/30/2021, 6:30 AM", 1000, 1000.00);
        assertEquals(testFlightDep.getdepartureTime(), Flight.getdepartureTime());
    }

    @Test
    public void testGetCapacity() 
    {
        Flight testFlightCap = new Flight(50, "Toronto", "Aruba", "02/31/2021, 6:30 AM", 1000, 1000.00);
        assertEquals(testFlightCap.getCapacity(), Flight.getCapacity());
    }

    @Test
    public void testGetnumberOfSeatsLeft() 
    {
        Flight testFlightNumof = new Flight(50, "Aruba", "Aruba", "01/30/2021, 6:30 AM", 10000, 1000.00);
        testFlightNumof.setnumberOfSeatsLeft(1000);
        assertEquals(testFlightNumof.getnumberOfSeatsLeft(), 1000);
    }

    @Test
    public void testGetoriginalPrice() 
    {
        Flight testFlightPrice = new Flight(50, "Toronto", "Aruba", "01/30/2021, 6:30 AM", 1000, 1000.00);
        assertEquals(testFlightPrice.getoriginalPrice(), Flight.getoriginalPrice(), 1000.00);
    }

    @Test
    public void testBookASeat() 
    {
        Flight testFlightBookSeat = new Flight(1, "Toronto", "Aruba", "02/31/2021, 6:30 AM", 1000, 1000.00);
        boolean seatIsBooked = testFlightBookSeat.BookASeat();
        assertEquals(seatIsBooked, true);
    }

    @Test
    public void testToString() 
    {
        Flight testFlighttoString = new Flight(1, "Toronto", "Aruba", "01/30/2021, 6:30 AM", 1000, 1000.00);
        assertEquals(testFlighttoString.toString(), Flight.toString());
    }
    
}