package com.deepSecurity.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.deepSecurity.Model.User;

@Service
public class UserService {

	List<User> users = new ArrayList<User>();

	public UserService() {
		users.add(new User("Deepak1", "Pass@1234", "dipak1@email.com"));
		users.add(new User("Deepak2", "Pass@1224", "dipak2@email.com"));
	}

	public List<User> getAllUsers() {

		return users;
	}

	public User getUserByUsername(String username) {

		return users.stream().filter(user -> user.getUsername().equals(username)).findAny().orElse(null);
	}

	public User addUser(User user) {
		
		return users.add(user) ? user : null;
	}

}
