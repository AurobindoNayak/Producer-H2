package com.aru.sender.senderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aru.sender.senderservice.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer>{
	
	public User save(User user);
	
	public User findById(int userId);

}
