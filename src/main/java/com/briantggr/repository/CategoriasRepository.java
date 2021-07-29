package com.briantggr.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.briantggr.model.Categoria;

public interface CategoriasRepository extends JpaRepository<Categoria, Integer> {

}
