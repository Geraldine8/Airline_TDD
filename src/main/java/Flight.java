import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Random;

import static java.lang.Math.random;

public class Flight {

    private Plane plane;
    private ArrayList<Passenger> passengers;
    private String flightNo;
    private String destination;
    private String departureAirport;
    private Date departureTime;
    private ArrayList<Integer> seatNumbers;

    public Flight(Plane plane, String flightNo, String destination, String departureAirport, Date departureTime) {
        this.plane = plane;
        this.passengers = new ArrayList<Passenger>();
        this.flightNo = flightNo;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }


    public Plane getPlane() {
        return this.plane;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public String getFlightNo() {
        return this.flightNo;
    }

    public String getDestination(){
        return this.destination;
    }

    public String getDepartureAirport() {
        return this.departureAirport;
    }


    public Date getDeparturteTime() {
        return this.departureTime;
    }

    public int availableSeats() {
        return this.plane.getCapacity() - this.passengers.size();
    }

    public void bookPassenger(Passenger passenger) {
        if (this.availableSeats() > 0) {
            this.passengers.add(passenger);
        }
    }

    public int getPassengerCount(){
        return this.passengers.size();
    }

    //more extensions

    //define the range
    public void main(String[] args) {
        int max =  this.plane.getCapacity();
        int min =  1;
        int range = max - min + 1;
     //generate random numbers

     for (int i = 0; i < this.plane.getCapacity(); i ++){
         int rand = (int) (random() * range) + min;
     }

        return rand
    }

//    public ArrayList<Integer> seatNumbers(){
//        return seatNumbers;
//    }
//
//    public int getRandomSeat() {
//        int totalNumOfSeats = this.plane.getCapacity();
//        Random random = new Random();
//        int randomSeatNumber = random.nextInt(totalNumOfSeats) + 1;
//        for (int seatNumber : this.seatNumbers ){
//            if (seatNumber == randomSeatNumber){
//                randomSeatNumber = this.getRandomSeat();
//            }
//        }
//        return randomSeatNumber;
//    }
    

}
