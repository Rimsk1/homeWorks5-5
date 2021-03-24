package study4;


import java.util.Arrays;
import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        int[] arr = new int[]{78, 32, 76, 100, 0, 6301, 331, 77, 24, 2, 90};
        //       System.out.print("массив с четными числами" + " ");
        int a = 0, b = 0;
        for (int i : arr) {
            if (i % 2 == 0) a += 1;
            if (i % 2 != 0) b += 1;
        }
        int[] arr1 = new int[a];
        int[] arr2 = new int[b];
        int c = a, d = b;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr1[a - c] = arr[i];
                c -= 1;
            }
            if (arr[i] % 2 != 0) {
                arr2[b - d] = arr[i];
                d -= 1;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}


