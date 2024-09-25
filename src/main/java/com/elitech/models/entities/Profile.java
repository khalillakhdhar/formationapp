package com.elitech.models.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
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
public class Profile  {
	@Id
	private long id;
	@Column(nullable = false)
	private String telephone;
	@Column(nullable = false)
	private String adresse;
	
	private String photo;
	@MapsId
	@JoinColumn(name = "id")
	@OneToOne(optional = false,cascade = CascadeType.ALL)
	private User user;
	
	

}
