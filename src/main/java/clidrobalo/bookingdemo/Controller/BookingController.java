package clidrobalo.bookingdemo.Controller;

import clidrobalo.bookingdemo.Model.HotelBooking;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/bookings")
public class BookingController {
    private List<HotelBooking> hotelBookingList;

    public BookingController() {
        this.hotelBookingList =  new ArrayList<>();

        this.hotelBookingList.add(new HotelBooking("5Star", 200, 2));
        this.hotelBookingList.add(new HotelBooking("Prestigio", 150, 4));
        this.hotelBookingList.add(new HotelBooking("Ibis", 90, 1));
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<HotelBooking> getAllBookings() {
        return this.hotelBookingList;
    }

    @RequestMapping(value = "/affordable/{price}", method = RequestMethod.GET)
    public List<HotelBooking> getAffordable(@PathVariable double price) {
        return hotelBookingList.stream()
                .filter(b -> b.getPricePerNight() <= price)
                .collect(Collectors.toList());
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public List<HotelBooking> createNewBooking(@RequestBody HotelBooking hotelBooking) {
        this.hotelBookingList.add(hotelBooking);
        return hotelBookingList;
    }
 }
