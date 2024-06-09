package A_HotelLondon;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import A_HotelLondon.Data.Entity.Rooms;
import A_HotelLondon.Data.Repository.RoomRepository;

@Component
public class CommmandLineRunner implements CommandLineRunner {
	

	private final RoomRepository roomRepository;
	

	public CommmandLineRunner(RoomRepository roomRepository) {
		this.roomRepository = roomRepository;
	}


	@Override
	public void run(String... args) throws Exception {
		
		
		
		List<Rooms> rooms= this.roomRepository.findAll();
		Optional<Rooms> room= this.roomRepository.findByRoomNumberIgnoreCase("p1");
		
		//System.out.println(room);
		
		//System.out.println(rooms.toString());
		
	}

}
