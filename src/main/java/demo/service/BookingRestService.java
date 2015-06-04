package demo.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.entity.Booking;
import demo.modules.BookingRepository;


@RestController
public class BookingRestService {

	
	@Autowired
	BookingRepository bookingRepository;
	
	@RequestMapping("/booking")
	Collection<Booking> bookings()
	{
		return this.bookingRepository.findAll();
	}
	
	
	@RequestMapping("/getbyid")
	Booking getBookingbyID(Long id){
		return this.bookingRepository.findOne(id);
		
	}
	
}
