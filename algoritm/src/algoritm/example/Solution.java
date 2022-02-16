package algoritm.example;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

// 각 기능의 진도가 100%일 때, 서비스에 반영 가능
// 먼저 배포가 되어야 하는 순서대로 작업의 진도가 적힌 정수 배열
// 각 배포마다 몇 개의 기능이 배포되는지를 return
public class Solution {
    //[93, 30, 55]	[1, 30, 5]	[2, 1]
    //

    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = new int[progresses.length];

        if(progresses.length <= 100 && speeds.length <= 100){
            Queue<Integer> queue = new LinkedList<>();
            do{

                for(int i = 0; i < progresses.length; i++){

                    if (progresses[i] == -1){
                        continue;
                    }

                    int curProcess = progresses[i] + speeds[i];

                    if (curProcess >= 100){
                        queue.add(i);
                        progresses[i] = -1;
                    }else {
                        progresses[i] = curProcess;
                    }
                }

            }while (queue.size() != progresses.length);


                 // 2, 3, 5, 0, 1, 4
            if (!queue.isEmpty()) {
                int min = 0;
                boolean ok = true;
                int aIdx = 0;
                int cnt = 0;
                Queue<Integer> q = new LinkedList<>();
                do{
                    int cur = queue.peek();

                    if(min == cur){
                        do{
                            cnt += 1;
                            min += 1;
                        }while (min == cur);
                    }

                    answer[aIdx] = cnt;



                }while (ok);

                queue.clear();
            }

        }

        return answer;
    }

    public static void main(String[] args) {
        int arr1[] = {95, 90, 99, 99, 80, 99};
        int arr2[] = {1, 1, 1, 1, 1, 1};
        Solution sort = new Solution();

        System.out.println(Arrays.toString(sort.solution(arr1, arr2)));

    }

}