package com.devsuperior.userDept.repository;

import com.devsuperior.userDept.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

//Uma classe repository é usada para realizarmos querys para se comunicar com o banco de dados
public interface UserRepository extends JpaRepository<User /*Tipo de dado*/, Long /*Tipo do id*/> {

}
