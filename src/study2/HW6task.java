package study2;

import java.util.Scanner;

public class HW6task {
    public static void main(String[] args) {

        int in1 = 0, in2 = 0, max = 100, min = 1;
        Scanner userNum5 = new Scanner(System.in);
        Scanner userNum6 = new Scanner(System.in);
        System.out.println("При ответах используйте 1 - да, 0 - нет");
        while (in1 == 0) {
            int ques = (int) (Math.random() * 2);
            System.out.println("Ваше число " + (max + min) / 2 + "?");
            in1 = userNum5.nextInt();
            if (in1 == 1) {
                System.out.println("Я так и знал!");
                break;
            }
            if (ques == 1) {
                System.out.println("Оно больше?");
                in2 = userNum6.nextInt();
                if (in2 == 1) {
                    min = (max + min) / 2;
                } else {
                    max = (max + min) / 2;
                }
            }
            if (ques == 0) {
                System.out.println("Оно меньше?");
                in2 = userNum6.nextInt();
                if (in2 == 1) {
                    max = (max + min) / 2;
                } else {
                    min = (max + min) / 2;
                }
            }
            if (min == 99) {
                System.out.println("Ваше число 100! Это было трудно.");
                break;
            }
        }
    }
}

