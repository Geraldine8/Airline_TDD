import org.junit.Before;
import org.junit.Test;


import java.util.Date;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    private Flight flight;
    private Plane plane;
    private Passenger passenger;

    @Before
    public void before(){
        this.plane = new Plane(PlaneType.BOEING747);
        this.flight = new Flight(plane, "GLA 907", "AMS", "GLA", new Date(2019, 10, 22, 9, 30));
        this.passenger = new Passenger("Fabiola", 3);


    }

    @Test
    public void getFlightNo(){
        assertEquals("GLA 907", flight.getFlightNo());
    }

    @Test
    public void flightDestination(){
        assertEquals("AMS", flight.getDestination());
    }

    @Test
    public void flightAirport(){
        assertEquals("GLA", flight.getDepartureAirport());
    }

    @Test
    public void getDepartureTime(){
        assertEquals(new Date(2019, 10, 22, 9, 30), flight.getDeparturteTime());
    }

    @Test
    public void availableSeats() {
        assertEquals(4, flight.availableSeats());
    }

    @Test
    public void bookASeat(){
        flight.bookPassenger(passenger);
        assertEquals(3, flight.availableSeats());
    }

    @Test
    public void cantOverbook(){
        flight.bookPassenger(passenger);
        flight.bookPassenger(passenger);
        flight.bookPassenger(passenger);
        flight.bookPassenger(passenger);
        flight.bookPassenger(passenger);
        assertEquals(4, flight.getPassengerCount());
    }



//    @Test
//    public void uniqueSeatNumber(){
//        flight.getRandomSeat();
//        flight.bookPassenger(passenger);
//        flight.bookPassenger(passenger);
//        assertEquals(30, flight.uniqueSeaNumber());
//    }


}
