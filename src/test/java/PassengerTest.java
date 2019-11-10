import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    private Passenger passenger;
    private Passenger passenger2;

    @Before
    public void before(){
        passenger = new Passenger("Fabiola", 2);
        passenger2 = new Passenger("Octavio", 2);
    }

    @Test
    public void passengerHasName(){
        assertEquals("Fabiola", passenger.getName());
    }

    @Test
    public void passengerHasBags(){
        assertEquals(2, passenger.getNumberOfBags());
    }

}

