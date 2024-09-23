package com.elitech.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elitech.models.entities.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
