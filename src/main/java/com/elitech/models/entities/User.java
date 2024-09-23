package com.elitech.models.entities;

import java.util.Set;

import com.elitech.models.BaseEntity;
import com.elitech.models.enums.Genre;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
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
public class User  extends BaseEntity{
@Column(nullable = false)
private String nom;
@Column(nullable = false)
private String prenom;
@Column(nullable = false,unique = true)
private String email;
@Column(nullable = false)
private String password;
@Enumerated(EnumType.STRING)
private Genre genre;
@Column(nullable = false)
private int age;

@OneToOne(mappedBy = "user",fetch = FetchType.EAGER)
@JsonIgnoreProperties("user")
Profile profile;
@ManyToMany(cascade = {CascadeType.MERGE,CascadeType.PERSIST})
@JsonIgnoreProperties("users")
Set<Course> courses;
}
