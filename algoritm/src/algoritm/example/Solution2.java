package algoritm.example;

import java.util.LinkedList;
import java.util.Queue;

// 문제: https://programmers.co.kr/learn/courses/30/lessons/42587
// 중요도가 높은 거 우선 순위로 출력
public class Solution2 {
	
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Integer> q = new LinkedList<Integer>();

        if(priorities.length < 0 && priorities.length > 100){
            return answer;
        }
        if(location < 0 && location > priorities.length-1){
            return answer;
        }
        int max = priorities[0]; 
        int i = 0;
        while(q.size() != priorities.length){
            int pre = priorities[0];
            if(i == priorities.length) {
            	i = 0;
            }

        	if(q.contains(i)){
                continue;
            }

            if(max < priorities[i]) {
            	q.clear();
            }
            
            if(pre < priorities[i]){
                q.poll();
            }
            
            
            if(!q.contains(i)){
                q.add(i);
                pre = priorities[i];
            }
            
            i++;
        }
        
        int pop = -1;
        while(pop != location) {
        	pop = q.poll();
            answer++;

        	if(pop == location) {
        		break;
        	}

        };
        
        return answer;
    }
	  
    public static void main(String[] args) {
        int arr1[] = {1, 1, 9, 1, 1, 1};
        int a = 0;
        Solution2 sort = new Solution2();

        System.out.println(sort.solution(arr1, a));

    }
	

}
