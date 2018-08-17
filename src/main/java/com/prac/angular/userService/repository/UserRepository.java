package com.prac.angular.userService.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.prac.angular.userService.domain.User;

@RepositoryRestResource
@CrossOrigin
public interface UserRepository extends JpaRepository<User, Long>{
	List<User> findAll();
	List<User> findByName(@Param("name") String name);
	List<User> findByEmail(@Param("email") String email);
	List<User> findByNameAndEmail(@Param("name") String name,
			@Param("email") String email);
}
