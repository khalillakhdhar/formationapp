package com.elitech.services.implement;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.elitech.models.entities.Course;
import com.elitech.repositories.CourseRepository;
import com.elitech.services.CourseService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CourseServiceImpl implements CourseService {
public final CourseRepository courseRepository;
	@Override
	public Page<Course> findAllCourse(Pageable pageable) {
		// TODO Auto-generated method stub
		return courseRepository.findAll(pageable);
	}

	@Override
	public Course addOneCourse(Course course) {
		// TODO Auto-generated method stub
		return courseRepository.save(course);
	}

	@Override
	public void deleteOneCourse(long id) {
		// TODO Auto-generated method stub
courseRepository.deleteById(id);
	}

	@Override
	public Course findOneCourse(long id) {
		// TODO Auto-generated method stub
		return courseRepository.findById(id).orElse(null);
	}

}
