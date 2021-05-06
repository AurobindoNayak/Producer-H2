package com.aru.sender.senderservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.aru.sender.senderservice.entity.User;
import com.aru.sender.senderservice.repository.UserRepository;

@RestController
public class UserSenderController {

	@Autowired
	private UserRepository repo;

	@PostMapping("/save")
	public User saveUser(@RequestBody User user) {
		repo.save(user);
		return user;
	}

	@GetMapping("/user/{id}")
	public User findbyId(@PathVariable int id) {
		User user = repo.findById(id);
		return user;
	}

}
