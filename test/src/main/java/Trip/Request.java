package Trip;


import java.util.ArrayList;

public class Request {
    private String source;
    private String destination;
    private ArrayList<Offer> OfferList = new ArrayList<>();
    private Ride ride ;
    private int passenger_num;

    public void setPassenger_num(int passenger_num) {
        this.passenger_num = passenger_num;
    }

    public int getPassenger_num() {
        return passenger_num;
    }

    public void setRide(Ride ride) {
        this.ride = ride;
    }

    public Ride getRide() {
        return ride;
    }

    public String getDestination() {
        return destination;
    }

    public String getSource() {
        return source;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public ArrayList<Offer> getOfferList() {
        return OfferList;
    }
    public void setOfferList(ArrayList<Offer> offerList) {
        OfferList = offerList;
    }


}