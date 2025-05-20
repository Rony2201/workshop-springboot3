package com.projetospring.projeto.repositories;

import com.projetospring.projeto.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoryRepository extends JpaRepository<Category, Long> { }
