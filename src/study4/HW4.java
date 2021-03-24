package study4;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class HW4 {

    public static void main(String[] args) {
        int arr[] = new int[]{2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        System.out.println("Массив в исходном виде");
        System.out.println(Arrays.toString(arr));
        System.out.println("Элементы в обратном порядке");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(" " + arr[i] + " ");
        }
    }
}
