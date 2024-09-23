package com.elitech.services.implement;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.elitech.models.entities.Categorie;
import com.elitech.repositories.CategorieRepository;
import com.elitech.services.CategoryService;

import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor
@Service
public class CategorieServiceImpl implements CategoryService {

	private final CategorieRepository categorieRepository;
	
	
	@Override
	public Page<Categorie> findAllCategorie(Pageable pageable) {
		// TODO Auto-generated method stub
		return categorieRepository.findAll(pageable);
	}

	@Override
	public Categorie addOneCategorie(Categorie categorie) {
		// TODO Auto-generated method stub
		return categorieRepository.save(categorie);
	}

	@Override
	public void deleteOneCategorie(long id) {
		// TODO Auto-generated method stub
		categorieRepository.deleteById(id);
	}

	@Override
	public Categorie findOneCategorie(long id) {
		// TODO Auto-generated method stub
		return categorieRepository.findById(id).orElse(null);
	}

}
