package com.expensetracker.releasev1.services;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.expensetracker.releasev1.exception.UserNotFoundException;
import com.expensetracker.releasev1.models.User;
import com.expensetracker.releasev1.repositories.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository userRepo;
	
	public User addUser(User user) {
		user.setId(UUID.randomUUID().getMostSignificantBits());
		return userRepo.save(user);
	}
	
	public List<User> findAllUsers(){
		return userRepo.findAll();
	}
	
	public User updateUser(User user){
		return userRepo.save(user);
	}
	
	public User findUserById(Long id){
		return userRepo.findUserById(id).orElseThrow(() -> new UserNotFoundException("User by ID" + id +"not Found"));
	}
	
	public void deleteUser(Long id) {
		userRepo.deleteUserById(id);
	}
	
}
