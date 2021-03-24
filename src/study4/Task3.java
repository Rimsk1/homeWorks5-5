package study4;

import java.util.Arrays;

public class Task3 {
    //    Дан массив целых чисел [-321, 894, -45, 782, -29, 12, -88]. Отрицательные элементы массива перенести в новый массив.
//    Размер массива должен быть равен количеству отрицательных элементов.
    public static void main(String[] args) {
        int arr[] = new int[]{-321, 894, -45, 782, -29, 12, -88};
        int a = 0;
        System.out.println("исходный массив");
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                a++;
            }
        }
        int arr1[] = new int[a];
        int countA = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr1[countA] = arr[i];
                countA++;
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(Arrays.toString(arr1));
        }
    }
}





