package com.users.usersManagment.model;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //If we don't explicitly specify a value, the generation type defaults to AUTO.
    private Long id;
    @Column(name = "userName",nullable = false)

    private String userName;
    @Column(name = "name",nullable = false)

    private String name;
    @Column(name = "email",nullable = false)

    private String email;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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
}
