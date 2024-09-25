package com.elitech.dto;

import java.util.Set;

import com.elitech.models.enums.Genre;
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
public class ProfileDto {
private long id;
private String telephone;
private String adresse;
private String photo;
@JsonIgnoreProperties("profile")

private UserDto user;
}
