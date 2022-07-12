package com.devsuperior.userDept.controller;


//Clase Controller para utilizarmos nossos endpoints, um objeto responsavel por receber e responder as requisições dos usuarios

import com.devsuperior.userDept.entities.User;
import com.devsuperior.userDept.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //indicando que é um controlador rest
@RequestMapping(value = "/users") //indicando o caminho para acessar essa classe
public class UserController {

    @Autowired //usado para mostrar que é uma injeção de dependencia
    private UserRepository repostiory;

    @GetMapping //indicando qual verbo http estamos utilizando no método
    public List<User> findAll(){
        List<User> result = repostiory.findAll(); //buscando todos os usuarios

        return result;
    }

    @GetMapping("/{id}") //indicando qual verbo http estamos utilizando no método
    public User findByUser(@PathVariable Long id){
        User result = repostiory.findById(id).get(); //buscando um usuario especifico

        return result;
    }

    @PostMapping //verbo http de gravar dados
    public User insert(@RequestBody User user){/*@RequestBody indica que o objeto será o corpo da requisição*/
        User result = repostiory.save(user); //inserindo usuario na tabela
        return result;
    }
}
