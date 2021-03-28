package com.company.library.catsAndMoses;

public class Cat {
    private String name;
    private String color;
    private int speed;
    private double weight;
    private Mouse catchedMouses;

    public Cat(String name, String color, int speed, double weight, Mouse catchedMouses) {
        this.name = name;
        this.color = color;
        this.speed = speed;
        this.weight = weight;
        this.catchedMouses = catchedMouses;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getSpeed() {
        return speed;
    }

    public double getWeight() {
        return weight;
    }

    public Mouse getCatchedMouses() {
        return catchedMouses;
    }

    public void setName(String name) {
        if (name == null || name.length() < 3) {
            throw new IllegalArgumentException("name to short");
        }
        this.name = name;
    }

    public void setColor(String color) {
        if (color == null || color.length() < 5) {
            throw new IllegalArgumentException("color to short");
            this.color = color;
        }


        public void setCatchedMouses (Mouse catchedMouses){
            this.catchedMouses = catchedMouses;
        }
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setCatchedMouses(Mouse catchedMouses) {
        this.catchedMouses = catchedMouses;

    }
}

