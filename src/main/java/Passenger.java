public class Passenger {

    private String name;
    private int numbersOfBags;
    private Flight flight;
    private int seatNumber;

    public Passenger(String name, int numberOfBags){
        this.name = name;
        this.numbersOfBags = numberOfBags;

    }

    public String getName() {
        return this.name;
    }

    public int getNumberOfBags() {
        return this.numbersOfBags;
    }

    //more extensions
    public void addFlight( Flight flight){
        this.flight = flight;
    }

    public void setSeatNumber(){
        this.seatNumber = seatNumber;
    }

    public int getSeatNumber(){
        return seatNumber;
    }

}
