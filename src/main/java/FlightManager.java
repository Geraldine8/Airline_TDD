
public class FlightManager {

    private Flight flight;

    public FlightManager(Flight flight) {
        this.flight = flight;
    }

    public int baggageLimit(){
        return flight.getPlane().getWeight()/2;
    }

    public int getBaggageWeigth() {
        return baggageLimit() /  flight.getPlane().getCapacity();
    }


    public int totalWeightBaggages() {
        int totalBags = 0;
        for (Passenger passenger : flight.getPassengers()) {
           totalBags += passenger.getNumberOfBags();
        }

        return totalBags * getBaggageWeigth();
    }

    public int remainingWeight() {
        return baggageLimit() - totalWeightBaggages();
    }

}
