package algoritm.array;

import java.util.Random;

class ArrReverseSort {

    public static int[] orReverse(final int[] arr) {

        for (int i = 0; i < arr.length / 2; i++) {
            int tmp = arr[i];
            arr[i] = arr[arr.length - (i + 1)];
            arr[arr.length - (i + 1)] = tmp;
        }

        return arr;
    }

    public static void main(final String[] args) {
        int[] a = new int[6];
        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(100);
            System.out.print(String.format("%d ", a[i]));
        }
        System.out.println();
        a = orReverse(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(String.format("%d ", a[i]));
        }
    }
}