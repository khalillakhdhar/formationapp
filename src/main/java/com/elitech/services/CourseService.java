package com.elitech.services;



import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.elitech.models.entities.Course;

public interface CourseService {
public Page<Course> findAllCourse(Pageable pageable);
public Course addOneCourse(Course course);
public void deleteOneCourse(long id);
public Course findOneCourse(long id);

}
