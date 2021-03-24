package study4;

public class HW4task1 {
    public static void main(String[] args)
    {
        int[] A = new int[25];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int imax = 0, imin = 0, swap;
        System.out.println("Исходный массив:");
        for (int i = 0; i < A.length; i++) {
            A[i] = (int) (Math.random()*498+2);
            System.out.print(A[i] + " ");
            if (A[i] < min) {
                min = A[i];
                imin = i;
            }
            if (A[i] > max) {
                max = A[i];
                imax = i;
            }
        }
        System.out.println("\nмаксимальное число A[" + (imax + 1) + "] = " + A[imax]);
        System.out.println("минимальное число A[" + (imin + 1) + "] = " + A[imin]);
        swap = A[imin];
        A[imin] = A[imax];
        A[imax] = swap;
        System.out.println("Массив после обмена:");
        for (int i = 0; i < A.length; i++) System.out.print(A[i] + " ");
    }
}


