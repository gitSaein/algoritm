package algoritm.basic;

import java.util.ArrayList;
import java.util.List;

import algoritm.example.Solution2;

class PrimeNumber {

    // 1000 까지의 숫자 중
    public List<Integer> getPrimeNumBy1000() {
        List<Integer> primeList = new ArrayList<>();
        int cnt = 0;
        for (int n = 2; n <= 1000; n++) {
            int i;
            for (i = 2; i < n; i++) {
                cnt++;
                if (n % i == 0) {
                    break;
                }

            }
            if (i == n) {
                primeList.add(n);
            }
        }
        System.out.printf("cnt: %d  ",cnt);
        return primeList;

    }

    public List<Integer> PrimeNumberV2(){
        List<Integer> arr = new ArrayList<>();
        arr.add(2);
        int cnt = 0;
        int ptr = 0;

        for(int n = 3; n <= 1000; n += 2){

            for(int i = ptr; i < arr.size(); i++){
                cnt++;
                int left = n%arr.get(i);
                if(left == 0){
                    break;
                }
                ++ptr;

            }
            
            if(ptr == arr.size()) {
            	arr.add(n);
            }
            
        }
        System.out.printf("cnt: %d  ",cnt);

        return arr;
    }

    public static void main(final String[] args) {
    	PrimeNumber p = new PrimeNumber();

        List<Integer> kk = p.getPrimeNumBy1000();
        System.out.println(kk.size());
    }
}