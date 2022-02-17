package algoritm.example;

import java.util.*;
import java.util.stream.Collectors;

// 각 기능의 진도가 100%일 때, 서비스에 반영 가능
// 먼저 배포가 되어야 하는 순서대로 작업의 진도가 적힌 정수 배열
// 각 배포마다 몇 개의 기능이 배포되는지를 return
public class Solution {
    //[93, 30, 55]	[1, 30, 5]	[2, 1]
    //

    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> answer = new ArrayList<>();
        Queue<Integer> range = new LinkedList<>();

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


            // 2, 3, 5, 0,1 4
            int min = 0;
            int totalCnt = 0;
            do{
                int cnt = 0;
                if(min == queue.peek()){
                    queue.poll();
                    cnt += 1;
                    totalCnt++;
                    while(range.contains(min + 1)) {
                        cnt++;
                        min++;
                        totalCnt++;
                    }
                    answer.add(cnt);

                    min++;
                } else {
                    range.add(queue.poll());
                }
            }while(totalCnt != progresses.length);

        }



        return answer.stream().filter(t-> t>0).mapToInt(i->i).toArray();
    }

    public static void main(String[] args) {
        int arr1[] = {93, 30, 55};
        int arr2[] = {1, 30, 5};
        Solution sort = new Solution();

        System.out.println(Arrays.toString(sort.solution(arr1, arr2)));

    }

}