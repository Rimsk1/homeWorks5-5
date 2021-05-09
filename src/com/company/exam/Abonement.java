package com.company.exam;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;

abstract public class Abonement {
//    объявляем локальные переменные
    private String name;
    private String surname;
    private int age;

    protected LocalDateTime regIn;
    protected  LocalDateTime regOff;
    protected LocalTime timeIn;
    protected LocalTime timeOff;
    protected boolean gym1;
    protected boolean pool1;
    protected boolean group1;
    protected  boolean gym2;
    protected boolean pool2;
    protected boolean group2;
    protected boolean gym3;
    protected boolean pool3;
    protected boolean group3;

    public Abonement(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setRegIn(LocalDateTime regIn) {
        this.regIn = regIn;
    }

    public void setRegOff(LocalDateTime regOff) {
        this.regOff = regOff;
    }

    public void setTimeIn(LocalTime timeIn) {
        this.timeIn = timeIn;
    }

    public void setTimeOff(LocalTime timeOff) {
        this.timeOff = timeOff;
    }

    public void setGym1(boolean gym1) {
        this.gym1 = gym1;
    }

    public void setPool1(boolean pool1) {
        this.pool1 = pool1;
    }

    public void setGroup1(boolean group1) {
        this.group1 = group1;
    }

    public void setGym2(boolean gym2) {
        this.gym2 = gym2;
    }

    public void setPool2(boolean pool2) {
        this.pool2 = pool2;
    }

    public void setGroup2(boolean group2) {
        this.group2 = group2;
    }

    public void setGym3(boolean gym3) {
        this.gym3 = gym3;
    }

    public void setPool3(boolean pool3) {
        this.pool3 = pool3;
    }

    public void setGroup3(boolean group3) {
        this.group3 = group3;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public LocalDateTime getRegIn() {
        return regIn;
    }

    public LocalDateTime getRegOff() {
        return regOff;
    }

    public LocalTime getTimeIn() {
        return timeIn;
    }

    public LocalTime getTimeOff() {
        return timeOff;
    }

    @Override
    public String toString() {
        return "Abonement{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
