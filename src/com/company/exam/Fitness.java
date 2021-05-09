package com.company.exam;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.util.Arrays;
import java.util.Formatter;

public class Fitness {
//        создаем массивы наших тарифов-абонементов
       private Abonement[] gym;
       private Abonement[] pool;
       private Abonement[] group;

               public  Fitness(){
           this.gym = new Abonement[20];
           this.pool = new Abonement[20];
           this.group = new Abonement[20];
               }

    public Abonement[] getGym() {
        return gym;
    }

    public Abonement[] getPool() {
        return pool;
    }

    public Abonement[] getGroup() {
        return group;
    }
    private void  addFitness(Abonement subscriber, String zone){
        switch (zone){
//            делаем проверку на вхождение в часы приема и абонемента, свитч как раз неплохо подошел        }
            case  "group":
                if (subscriber.getRegOff().isAfter(LocalDateTime.now())){
                    if (LocalTime.now().getHour()  > subscriber.getTimeIn().getHour() &&
                            LocalTime.now().getHour() < subscriber.getTimeOff().getHour()){
                        if (subscriber.isGroup1()){
                            for(int i =0; i<20; i++){
                                if(group[i] == null){
                                    group[i] = subscriber;
                                    subscriber.setGroup1(false);
                                    subscriber.setGym1(false);
                                    subscriber.setPool1(false);
                                    subscriber.setGroup3(true);
                                }
                            }
                        }
                    }
                }
        }

}

