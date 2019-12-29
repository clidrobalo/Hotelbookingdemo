package clidrobalo.bookingdemo.Controller;

import clidrobalo.bookingdemo.Dao.BookingRepository;
import clidrobalo.bookingdemo.Model.HotelBooking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/bookings")
public class BookingController {
    private BookingRepository bookingRepository;

    @Autowired
    public BookingController(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<HotelBooking> getAllBookings() {
       return bookingRepository.findAll();
    }

    @RequestMapping(value = "/affordable/{price}", method = RequestMethod.GET)
    public List<HotelBooking> getAffordable(@PathVariable double price) {
        return bookingRepository.findByPricePerNightLessThan(price);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public List<HotelBooking> createNewBooking(@RequestBody HotelBooking hotelBooking) {
        bookingRepository.save(hotelBooking);

        return bookingRepository.findAll();
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public List<HotelBooking> delete(@PathVariable long id) {
        bookingRepository.deleteById(id);

        return bookingRepository.findAll();
    }
 }
