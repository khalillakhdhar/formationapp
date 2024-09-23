package com.elitech.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elitech.models.entities.Categorie;

public interface CategorieRepository extends JpaRepository<Categorie, Long> {

}
