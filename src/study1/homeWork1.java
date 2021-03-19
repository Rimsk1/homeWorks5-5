package study1;

public class homeWork1 {
    public static void main(String[] args) {
//        Задача на арифметические операторы
//Найти сумму цифр 2х значного числа
        int num, a, b, sum;
        num = 17;
        a = num / 10;
        b = num % 10;
        sum = a + b;
        System.out.println(sum);
//        Задача на арифметические операторы
//Найти сумму цифр 3х значного числа
        int c, d;
        num = 357;
        a = num / 100;
        b = num % 10;
        c = num % 100 / 10;
        sum = a + b + c;
        System.out.println(sum);
//        Задача на тернарный оператор
//Даны переменные типа long start и end.
//Если start меньше end переменной between присвоить значение end - start, в противном случае -1

        long start, end, between;
        start = 10l;
        end = 8l;
        between = (start < end) ? end = start : end - 1;
        System.out.println("end " + end);
    }
}
