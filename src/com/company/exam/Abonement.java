package com.company.exam;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Abonement {
    String name;
    String surname;
    int age;

    protected LocalDateTime regIn;
    protected  LocalDateTime regOff;
    protected LocalTime timeIn;
    protected LocalTime timeOff;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
