package algoritm.basic;

import java.util.ArrayList;
import java.util.List;

class PrimeNumber {

    // 1000 까지의 숫자 중
    public static List<Integer> getPrimeNumBy1000(int r) {
        List<Integer> primeList = new ArrayList<>();
        for (int n = 2; n <= 1000; n++) {
            int i;
            for (i = 2; i < n; i++) {
                if (n % i == 0) {
                    break;
                }

            }
            if (i == n) {
                primeList.add(n);
            }
        }
        return primeList;

    }

    public static void main(final String[] args) {
        List<Integer> kk = getPrimeNumBy1000(2);
        System.out.println(kk);
    }
}