package com.company.farm;

abstract public class Animal {
    int weight;
    int speed;

    public Animal(int health) {

    }

    public int getWeight() {
        return weight;
    }

    public int getSpeed() {
        return speed;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
