package com.elitech.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.elitech.models.entities.Categorie;

public interface CategoryService {
	public Page<Categorie> findAllCategorie(Pageable pageable);
	public Categorie addOneCategorie(Categorie categorie);
	public void deleteOneCategorie(long id);
	public Categorie findOneCategorie(long id);
}
