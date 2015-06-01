package demo.modules;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.entity.Booking;



public interface BookingRepository extends JpaRepository<Booking, Long>{

	
	Collection<Booking> findByBookingName(String bookingName);
	
}
