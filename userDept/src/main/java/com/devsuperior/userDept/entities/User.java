package com.devsuperior.userDept.entities;

import javax.persistence.*;

@Entity //definindo que é uma entidade no esquema relacional, iremos transformar esse esquema relacional em um objeto
@Table(name = "tb_user") //nome da tabela
public class User {

    @Id //definir que esse é nosso primery key
    @GeneratedValue(strategy = GenerationType.IDENTITY) //definir que é auto incremento
    private long id;
    private String name;
    private String email;

    @ManyToOne //relacionamento de chave estrangeira (User tem 1 Dep e Dep tem muitos Users)
    @JoinColumn(name = "department_id") //mostrando qual o nome da chave estrangeira no banco
    private Department department;

    public User(){

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
