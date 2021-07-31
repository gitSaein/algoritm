package algoritm.array;

import java.util.Random;

class ArrMaxEx {

    public static int ofMax(final int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(final String[] args) {
        final int[] a = new int[5];
        final Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(100);
            System.out.print(String.format("%d ", a[i]));
        }
        System.out.println();
        System.out.println(ofMax(a));
    }
}