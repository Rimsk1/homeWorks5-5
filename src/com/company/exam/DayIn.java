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
        regIn = LocalDateTime.of(2021,(int)(Math.random()))
        regOff = LO
    }
}
