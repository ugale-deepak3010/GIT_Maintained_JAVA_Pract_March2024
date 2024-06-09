package A_HotelLondon.Data.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import A_HotelLondon.Data.Entity.Rooms;

public interface RoomRepository extends JpaRepository<Rooms, Long> {

	// idk why he created.
	
	Optional<Rooms> findByRoomNumberIgnoreCase(String roomNumber);
}
