package com.prac.angular.userService.controller;

import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prac.angular.userService.repository.UserRepository;
import com.prac.angular.userService.service.UserService;
import com.prac.angular.userService.domain.User;

@RestController
public class UserController {
	@Autowired
	UserRepository userRepository;
	
	UserService userService;
	
	public UserController(UserRepository userRepository){
		this.userRepository = userRepository;
	}
	
	@GetMapping("/users-list")
    @CrossOrigin(origins = "http://localhost:4200")
    public Collection<User> users() {
		System.out.println(userRepository.findAll());
        return userRepository.findAll().stream().collect(Collectors.toList());
    }
//	
//	@RequestMapping(value = "/users/", method = RequestMethod.DELETE)
//    public void deleteUser(@RequestParam(value = "id") String id) {
//		userService.deleteUser(id);
//    }
	
}
