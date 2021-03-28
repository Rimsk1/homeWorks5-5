package com.company.library;

import java.util.Objects;

public class Author {
private String name;
private String lastName;

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public Author(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;

    }

    public void setName(String name) {
    if(name==null ||name.length()<2 ){
        throw new IllegalArgumentException(" Имя слишком короткое");
    }

        this.name = name;
    }

    public void setLastName(String lastName) {
        if (lastName == null|| lastName.length()<2){
            throw new IllegalArgumentException("Фамилия слишком короткая");
        }
        this.lastName = lastName;
    }
// public void

    @Override
    public String toString() {
        return "Autor{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
