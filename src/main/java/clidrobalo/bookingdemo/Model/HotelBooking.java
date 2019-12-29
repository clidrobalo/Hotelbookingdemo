package clidrobalo.bookingdemo.Model;

public class HotelBooking {
    private String name;
    private double pricePerNight;
    private int nrOfNight;

    public HotelBooking(String name, double pricePerNight, int nrOfNight) {
        this.name = name;
        this.pricePerNight = pricePerNight;
        this.nrOfNight = nrOfNight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(double pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public double getTotalPrice() {
        return this.nrOfNight * pricePerNight;
    }

    public int getNrOfNight() {
        return nrOfNight;
    }

    public void setNrOfNight(int nrOfNight) {
        this.nrOfNight = nrOfNight;
    }
}
