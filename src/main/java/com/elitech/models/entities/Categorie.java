package com.elitech.models.entities;

import java.util.List;

import com.elitech.models.BaseEntity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
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
public class Categorie extends BaseEntity {
private String nom;
@OneToMany(fetch = FetchType.EAGER,mappedBy = "categorie")
@JsonIgnoreProperties("categorie")
private List<Course> courses;
}
