package com.ann.boot.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.util.HashSet;
import java.util.Set;

public class Department {
    private Integer id;
    private String name;
    private Set<User> users = new HashSet<User>();


    public Set<User> getUsers() {
        return users;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

}
