package study2;

import jdk.swing.interop.SwingInterOpUtils;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class homeWork2 {
    public static void main(String[] args) {
        /*1. Задача на if
Дана целочисленная переменная count - количество верных ответов.
В зависимости от значения этой переменной вывести в консоль оценку:
100 - 90 правильных ответов - отлично
89 - 60 правильных ответов - хорошо
59 - 40 правильных ответов - удовлетворительно
39 - 0 правильных ответов - попробуйте в следующий раз*/
        int num = 0;
        if (num >= 90 && num <= 100) {
            System.out.println("отлично");

        } else if (num >= 60 && num <= 89) {
            System.out.println("хорошо");

        } else if (num >= 40 && num <= 59) {
            System.out.println("удовлетворительно");
        } else if (num >= 0 && num <= 39) {
            System.out.println("попробуйте в следующий раз");
        }
        /* Задача на switch
Пользователь вводит 3 числа:
1е - первый операнд
2e - второй операнд
3е - оператор
В зависимости от третьего введенного числа нужно вывести в консоль:
сумму, разность, умножение, деления чисел, которые ввел пользователь.
Если 3е введенное число 3, нужно найти сумму,
если 5 - разность,
если 7 - результат умножения,
если 9 - результат деления.
*/

        Scanner in1 = new Scanner(System.in);
        System.out.println("введите операнд 1");
        int num1 = in1.nextInt();
        Scanner in2 = new Scanner(System.in);
        System.out.println("введите операнд 2");
        int num2 = in2.nextInt();
        Scanner oper = new Scanner(System.in);
        System.out.println("введите число обозначающее оператор");
        int calc = oper.nextInt();
        switch (calc) {
            case 3:
                System.out.println(num1 + num2);
                break;
            case 5:
                System.out.println(num1 / num2);
                break;
            case 7:
                System.out.println(num1 * num2);
                break;
            case 9:
                System.out.println(num1 - num2);
                break;
            default:
                System.out.println("вы не ввели математический оператор 3/5/7/9");

        }
        /*3. Задача на цикл while
Считать с консоли количество тарелок и количество моющего средства
Моющее средство расходуется из расчета 0.5 на 1 тарелку
В цикле выводить сколько моющего средства осталось после мытья каждой тарелки.
В конце вывести сколько тарелок осталось, когда моющее средство закончилось или
наоборот.*/

        Scanner in3 = new Scanner(System.in);
        System.out.println("укажите количество тарелок");
        int plate = in3.nextInt();
        Scanner in4 = new Scanner(System.in);
        System.out.println("укажите количество моющего средства");
        double fairy = in4.nextDouble();
        while (fairy >= 0 && plate >= 0) {

            if (fairy == 0) {
                System.out.println("у вас осталось  " + plate + "грязных тарелок");

            } else if (plate == 0) {
                System.out.println("все тарелки чистые. моющего средства осталось " + fairy);

            } else if (plate == 0 && fairy == 0) System.out.println("все тарелки вымыты, моющее средство кончилось");
            plate--;
            fairy = fairy - 0.5;

        }


/*4. Программа загадывает число в диапазоне [1;9]
Пользователь вводит число с клавиатуры
Программа в зависимости от введенного числа выводит в консоль следующее:
"загаданное число больше"
"загаданное число меньше"
"Вы угадали" (программа завершает работу)
если введен 0, выводит "выход из программы" (программа завершает работу)*/


        Scanner scan = new Scanner(System.in);
        String playAgain = "";
        do {
            int theNumber = (int) (Math.random() * 10);
            int guess = 0;
            while (guess != theNumber) {
                System.out.println("угадайте число от 1 до 10");
                guess = scan.nextInt();
                if (guess > theNumber)
                    System.out.println(guess + " попробуйте ввести число поменьше");
                else if (guess < theNumber)
                    System.out.println(guess + " попробуйте ввести число побольше");
                else
                    System.out.println(guess + " вы победили!");
            }
            System.out.println("хотите сыграть еще? (y/n)?");
            playAgain = scan.next();
        } while (playAgain.equalsIgnoreCase("y"));
        System.out.println("спасибо за игру!");
        scan.close();
            /* 5. Задача на Math.random() и if
Написать код, который будет проверять попало ли случайно сгенерированное целое число из отрезка [10;500]
в интервал (25;200) и выводить результат в консоль.
Примеры работы программы:
Число 345 не содержится в интервале (25;200)
Число 110 содержится в интервале (25;200) */
        int min2 = 10, max2 = 500;
        int x = min2 + (int) (Math.random()* (max2-min2) + 1);
        if ( x >= 25 ||  x <= 200) {
            System.out.println("случайное число в диапазоне [25:200] " + x);

        }

    }
}

















