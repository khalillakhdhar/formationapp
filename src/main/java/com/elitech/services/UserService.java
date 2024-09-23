package com.elitech.services;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.elitech.models.entities.Profile;
import com.elitech.models.entities.User;

public interface UserService {
	public User addOneUser(User user); // quasi null complexity
	public Page<User> findAllUsers(Pageable pageable);
	public void deleteOneUser(long id);
	public Profile assignProfileToUser(long userId, Profile profile);
	public User assignUserToCourse(long userId,long courseId);
	public User findOneUser(long id);
	
	

}
