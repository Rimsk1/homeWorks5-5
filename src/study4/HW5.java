package study4;

import java.util.Arrays;
import java.util.Random;

public class HW5 {
    //         Создать массив из 11 случайных целых чисел из отрезка [-1;1], вывести массив в консоль.
// Определить какой элемент встречается в массиве чаще всего и вывести информацию об этом в консоль.
    public static void main(String[] args) {
        int[] arr = new int[11];
        int x=0, y=0, z= 0;
        for (int h= 0; h<arr.length; h++) {
            arr[h] = ((int) (Math.random() * 3) - 1);
        } System.out.println(Arrays.toString(arr));
        for (int i=0; i<arr.length; i++){
            for (int j = i; j<arr.length; j++){
                if (arr[i]==arr[j]){
                     x+=1;
                    if (x> y){
                        y=x;
                         z = arr[j];
                    }
                }
            }
            x=0;
        }
        System.out.println("число  "+ z + " повторяется " + y + " раз");
    }
}
