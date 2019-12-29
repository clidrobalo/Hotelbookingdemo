package clidrobalo.bookingdemo.Dao;

import clidrobalo.bookingdemo.Model.HotelBooking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DataBaseSeeder implements CommandLineRunner {

    private  BookingRepository bookingRepository;

    @Autowired
    public DataBaseSeeder(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        List<HotelBooking> bookings =  new ArrayList<>();

        bookings.add(new HotelBooking("5Star", 200, 2));
        bookings.add(new HotelBooking("Prestigio", 150, 4));
        bookings.add(new HotelBooking("Ibis", 90, 1));

        bookingRepository.saveAll(bookings);
    }
}

