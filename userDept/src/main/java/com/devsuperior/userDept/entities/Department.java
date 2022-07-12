package com.devsuperior.userDept.entities;

import javax.persistence.*;

@Entity //definindo que é uma entidade no esquema relacional, iremos transformar esse esquema relacional em um objeto
@Table(name = "tb_department") //nome da tabela
public class Department {

    @Id //definir que esse é nosso primery key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //definir que é auto incremento
    private long id;
    private String name;

    public Department(){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
