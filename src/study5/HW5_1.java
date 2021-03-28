package study5;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.Scanner;

public class HW5_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String n = scan.next();

        String[] strArr = n.split("");
        for (String word : strArr) {
            System.out.println(word);

        }

    }
}
