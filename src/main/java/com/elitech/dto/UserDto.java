package com.elitech.dto;

import java.util.Set;

import com.elitech.models.enums.Genre;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
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
public class UserDto extends BaseDTO {
@NotBlank
private String nom;
@NotBlank
private String prenom;
@Min(value = 18)
private int age;
@Email
@NotBlank
private String email;
@NotBlank
private String password;
@NotBlank
private Genre  genre;
@JsonIgnoreProperties("user")
private ProfileDto profile;
@JsonIgnoreProperties("users")

private Set<CourseDto> courses;

}
