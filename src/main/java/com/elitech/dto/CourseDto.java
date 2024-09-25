package com.elitech.dto;

import java.util.Set;

import com.elitech.models.enums.Genre;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;



@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CourseDto extends BaseDTO {
	private String titre;
	private String description;
	private String prix;
	@JsonIgnore
	private Set<UserDto> users;
	
	@JsonIgnoreProperties("courses")
	private CategoriesDto categorie;
}
