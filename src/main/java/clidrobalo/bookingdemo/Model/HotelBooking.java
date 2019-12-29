package clidrobalo.bookingdemo.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class HotelBooking {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private String name;
    private double pricePerNight;
    private int nrOfNight;

    public HotelBooking() {

    }

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

    public long getId() {
        return id;
    }
}
