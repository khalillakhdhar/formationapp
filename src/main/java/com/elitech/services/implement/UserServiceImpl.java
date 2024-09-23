package com.elitech.services.implement;

import java.util.Set;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.elitech.models.entities.Course;
import com.elitech.models.entities.Profile;
import com.elitech.models.entities.User;
import com.elitech.repositories.CourseRepository;
import com.elitech.repositories.UserRepository;
import com.elitech.services.UserService;

import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

	private final UserRepository userRepository;
	private final CourseRepository courseRepository;
	
	
	
	@Override
	public User addOneUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	@Override
	public Page<User> findAllUsers(Pageable pageable) {
		// TODO Auto-generated method stub
		return userRepository.findAll(pageable);
	}

	@Override
	public void deleteOneUser(long id) {
		// TODO Auto-generated method stub
		userRepository.deleteById(id);

	}

	@Override
	public Profile assignProfileToUser(long userId, Profile profile) {
		// TODO Auto-generated method stub
		
		User user=userRepository.findById(userId).orElse(null);
		if(!user.equals(null))
		{
		user.setProfile(profile);
		 userRepository.save(user);
		 return profile;
		}
		else
		return null;
	}

	@Override
	public User assignUserToCourse(long userId, long courseId) {
		// TODO Auto-generated method stub
		User user=userRepository.findById(userId).orElse(null);
		Course course=courseRepository.findById(courseId).orElse(null);
		if(!user.equals(null)&&!course.equals(null))
		{
			Set<Course> courses=user.getCourses();
			courses.add(course);
			user.setCourses(courses);
			return user;
		}
		else
		return null;
	}

	@Override
	public User findOneUser(long id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id).orElse(null);
	}

}
