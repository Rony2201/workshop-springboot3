package com.projetospring.projeto.repositories;

import com.projetospring.projeto.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UserRepository extends JpaRepository<User, Long> {


}
