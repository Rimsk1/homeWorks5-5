package com.company.exam;

import java.time.LocalTime;

public class Allinc extends Abonement{
    public Allinc(String name, String surname, int age) {
        super(name, surname, age);
        pool1 = true;
        gym1 = true;
        group1 = true;
        pool1 = true;
         gym2 = true;
         group2 = true;
         timeIn = LocalTime.of(8,0);
         timeOff =LocalTime.of(22,0);

    }
}
