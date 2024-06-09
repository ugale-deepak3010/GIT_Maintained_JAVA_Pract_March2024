package A_HotelLondon.Data.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

/*
 CREATE TABLE ROOMS(
  ROOM_ID BIGINT PRIMARY KEY auto_increment,
  NAME VARCHAR(16) NOT NULL,
  ROOM_NUMBER CHAR(2) NOT NULL UNIQUE,
  BED_INFO CHAR(2) NOT NULL
);
 */
@Data // generate it getters and setters.
@Entity
@Table(name = "ROOMS")
public class Rooms {

	@Id
	@Column(name = "ROOM_ID")
	private Long roomId;

	@Column(name = "NAME")
	private String name;

	@Column(name = "ROOM_NUMBER")
	private String roomNumber;

	@Column(name = "BED_INFO")
	private String bedInfo;

}
