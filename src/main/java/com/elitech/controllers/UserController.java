package com.elitech.controllers;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elitech.models.entities.Profile;
import com.elitech.models.entities.User;
import com.elitech.services.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("user")
@RequiredArgsConstructor
public class UserController {
	public final UserService userService;
	@GetMapping
	public Page<User> getAll(Pageable pageable)
	{
		return userService.findAllUsers(pageable);
	}
	@PostMapping
	public User addOne(@RequestBody User user)
	{
		return userService.addOneUser(user);
	}
	
	@DeleteMapping("/{id}")
	public void deleteOne(@PathVariable long id)
	{
		userService.deleteOneUser(id);
	}
	@PutMapping("/profile/{idUser}")
	public Profile assignProfile(@PathVariable long idUser, Profile profile)
	{
		return userService.assignProfileToUser(idUser, profile);
	}
	@PutMapping("/course/{idUser}/{courseId}")
	public User assignCourse(@PathVariable long idUser,@PathVariable long courseId)
	{
		return userService.assignUserToCourse(idUser, courseId);
	}

}
