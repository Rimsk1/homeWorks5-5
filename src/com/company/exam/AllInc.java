package com.company.exam;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class AllInc extends Abonement{
    public AllInc(String name, String surname, int age) {
        super(name, surname, age);
        pool1 = true;
        gym1 = true;
        group1 = true;
        pool1 = true;
         gym2 = true;
         group2 = true;
         timeIn = LocalTime.of(8,0);
         timeOff =LocalTime.of(22,0);
        regIn = LocalDateTime.of(2021,(int)(Math.random()*3+1),(int)(Math.random()*15),(int)(Math.random()*24),0);
        regOff = regIn.plusDays((int)(Math.random()*365)).plusHours((int)(Math.random()*24));

    }
}
