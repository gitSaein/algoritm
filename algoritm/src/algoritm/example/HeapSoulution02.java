package algoritm.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class HeapSoulution02 {

	
	public int solution(int[][] jobs) {
        int answer = 0;
        int end = 0;
        int idx = 0;
        
        Arrays.sort(jobs, Comparator.comparingInt(o1 -> o1[0]));
        PriorityQueue<int[]> q = new PriorityQueue<>((o1,o2)->o1[1] - o2[1]);
  
        
      
        while(true) {
        	while(idx != jobs.length && jobs[idx][0] <= end) {
            	q.add(jobs[idx++]);
            }
        	
        	if(q.size() == 0) {
        		end = jobs[idx][0];
        	}
        	
    		int[] tmpq = q.poll();
    		answer += tmpq[1] + end - tmpq[0];
        	end += tmpq[1]; 
   
        	
        	if(q.isEmpty() && idx == jobs.length) {
        		break;
        	}
        }
        
        return (int)(answer/jobs.length);
    }
	 

    public static void main(String[] args) {
        int arr1[][] = {{0, 3}, {1, 9}, {2, 6}};
 
        HeapSoulution02 sort = new HeapSoulution02();

        System.out.println(sort.solution(arr1));

    }
}
