package com.example.demo;

public class UsersEntity {
    public Long id;
    public String name;
    public String email;

    public UsersEntity(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }


}
