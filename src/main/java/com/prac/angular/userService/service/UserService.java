package com.prac.angular.userService.service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prac.angular.userService.domain.User;
import com.prac.angular.userService.repository.UserRepository;


@Service
public class UserService {
	@Resource
	@Autowired 
	private UserRepository userRepository;
	
	public void save(User user) {
		userRepository.save(user);
	}
	
	public void deleteUser(String id) {
		userRepository.deleteById(Long.parseLong(id));

    }

    public void updateUser(User user) {
    	userRepository.save(user);
    }
}
