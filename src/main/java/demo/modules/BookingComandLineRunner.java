package demo.modules;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import demo.entity.Booking;

@Component
public class BookingComandLineRunner implements CommandLineRunner{

	
    @Autowired
    BookingRepository bookingrespository;
	
    @Override
	public void run(String... args) throws Exception {
		
		for(Booking b : this.bookingrespository.findAll()){
			
			System.out.println("values are "+b.toString());
		}
		
	}
}
