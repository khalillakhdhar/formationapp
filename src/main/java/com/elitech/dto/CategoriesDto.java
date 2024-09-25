package com.elitech.dto;

import java.util.List;
import java.util.Set;

import com.elitech.models.enums.Genre;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.validation.constraints.NotBlank;
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
public class CategoriesDto extends BaseDTO {
	@NotBlank
	private String nom;
	@JsonIgnoreProperties("categorie")
	private List<CourseDto> courses;
}
