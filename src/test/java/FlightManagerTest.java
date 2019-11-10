import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {


    private Plane plane;
    private FlightManager manager;
    private Flight flight;
    private Passenger passenger;

    @Before
    public void before(){
        this.plane = new Plane(PlaneType.BOEING747);
        this.passenger = new Passenger("Fabiola", 1);
        this.flight = new Flight(plane, "GLA 907", "AMS", "GLA", new Date(2019, 10, 22, 9, 30));
        this.manager = new FlightManager(flight);
    }

    @Test
    public void calculateBaggageWeight(){
        assertEquals(10, manager.getBaggageWeigth());
    }

    @Test
    public void calculateWeightPerPassenger(){
        flight.bookPassenger(passenger);
        flight.bookPassenger(passenger);
        flight.bookPassenger(passenger);
        assertEquals(30, manager.totalWeightBaggages());
    }

    @Test
    public void remainingWeight(){
        flight.bookPassenger(passenger);
        flight.bookPassenger(passenger);
        flight.bookPassenger(passenger);
        assertEquals(10, manager.remainingWeight());
    }


}
