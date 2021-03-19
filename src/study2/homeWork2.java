package study2;

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
        int  num = 0;
        if (num >= 90 && num <= 100){
            System.out.println("отлично");

        } else if (num >= 60 && num <= 89){
            System.out.println("хорошо");

        } else if (num >= 40 && num <= 59){
            System.out.println("удовлетворительно");
        }else if (num >= 0 && num <=39){
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
        switch (calc){
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



        }
        /*3. Задача на цикл while
Считать с консоли количество тарелок и количество моющего средства
Моющее средство расходуется из расчета 0.5 на 1 тарелку
В цикле выводить сколько моющего средства осталось после мытья каждой тарелки.
В конце вывести сколько тарелок осталось, когда моющее средство закончилось или
наоборот.*/


    }

}
