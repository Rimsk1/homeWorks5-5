package com.company.farm;

public abstract class  WildBeast extends Animal implements AtackAble{
    int force;
    String name;
    private int attackScore;
    public WildBeast (int health, int attackScore){
        super(health);
        this.attackScore=attackScore;
    }

}
