package com.example.demo.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.persistence.model.Filmes;

@Repository
public interface FilmeRepository extends JpaRepository<Filmes, Integer>{

}
