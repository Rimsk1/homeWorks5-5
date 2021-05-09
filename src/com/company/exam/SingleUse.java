package com.company.exam;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class SingleUse extends Abonement {

    public SingleUse(String name, String surname, int age) {
        super(name, surname, age);
        pool1 = true;
        gym1 = true;
        group1 = false;
        pool2 = true;
        gym2 = true;
        group2 = false;
//        устанавливаем время входа и выхода тарифа
        timeIn = LocalTime.of(8, 0);
        timeOff = LocalTime.of(16, 0);
//        делаем условный рандомизатор, для наших спортсменов
        regIn = LocalDateTime.of(2021, (int) (Math.random() * 3 + 1), (int) (Math.random() * 15), (int) (Math.random() * 24), 0);
        regOff = regIn.plusDays((int) (Math.random() * 365)).plusHours((int) (Math.random() * 24));

    }
}
