package com.company.exam;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class DayIn extends Abonement {
    public DayIn(String name, String surname, int age) {
        super(name, surname, age);
        pool1= false;
        gym1=true;
        group1=true;
        pool2 = false;
        gym2 = true;
        group2=true;
//        устанавливаем время входа и выхода тарифа
        timeIn= LocalTime.of(8,0);
        timeOff = LocalTime.of(16,0);
//        делаем условный рандомизатор, для наших спортсменов
        regIn = LocalDateTime.of(2021,(int)(Math.random()*3+1),(int)(Math.random()*15),(int)(Math.random()*24),0);
        regOff = regIn.plusDays((int)(Math.random()*365)).plusHours((int)(Math.random()*24));

    }
}
