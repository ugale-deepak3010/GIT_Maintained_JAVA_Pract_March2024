package com._TheymeLeaf_Pract1.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com._TheymeLeaf_Pract1.Model.Room;
import com._TheymeLeaf_Pract1.Service.RoomService;

@SuppressWarnings("unused")
@RestController
@RequestMapping("/api/rooms")
public class RoomRestController {
	
	//@Autowired
	private RoomService roomService;
	
	public RoomRestController(RoomService roomService) {
		this.roomService = roomService;
	}

	@GetMapping
	public List<Room> getAllRoomsByAPI(){
		return roomService.getAllRoom();
	}
}
