package com.elitech.models.entities;

import java.util.Set;

import com.elitech.models.BaseEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@JsonIgnoreProperties("{hibernateLazyInitializer,handler}")
public class Course extends BaseEntity {
	private String titre;
	private String description;
	private String prix;
	@ManyToMany(mappedBy = "courses")
	@JsonIgnore
	private Set<User> users;
	@ManyToOne(optional = false,fetch = FetchType.EAGER)
	@JsonIgnoreProperties("courses")
	private Categorie categorie;

}
