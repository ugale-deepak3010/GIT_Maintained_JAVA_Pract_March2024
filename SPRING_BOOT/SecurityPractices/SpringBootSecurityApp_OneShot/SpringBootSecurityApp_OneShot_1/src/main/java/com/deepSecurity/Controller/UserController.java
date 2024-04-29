package com.deepSecurity.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deepSecurity.Model.User;
import com.deepSecurity.Service.UserService;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping
	public List<User> getAllUsers() {
		return userService.getAllUsers();
	}

	@GetMapping("/{username}")
	public User getUserByUsername(@PathVariable String username) {

		return userService.getUserByUsername(username);
	}

	@PostMapping
	public User addNewUser(@RequestBody User user) {
		return userService.addUser(user);
	}
}


















