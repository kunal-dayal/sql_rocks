package com.example.Sql_Rocks;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table(name = "user_info ")
public class User  {

        //attributes
    @Id
    private int id;

    private String name;

    private int age;

        //default constructor
    public User() {
    }

        //parameterized constructor
    public User(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    //getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
