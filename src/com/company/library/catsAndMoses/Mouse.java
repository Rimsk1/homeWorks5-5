package com.company.library.catsAndMoses;

public class Mouse {
    private int  speed;
    private int numMouse;

    public void setSpeed(int speed) {
        if (speed<1){

        }
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public int getNumMouse() {
        return numMouse;
    }

    public Mouse(String name, int speed) {
        this.speed = speed;
        this.numMouse = numMouse;
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "speed=" + speed +
                ", numMouse=" + numMouse +
                '}';
    }
}
