package algoritm.example;

import java.util.*;

public class HeapSolution03 {
	public int[] solution(String[] operations) {
        int[] answer = {0,0};
        int min = 0;
        int max = 0;

        Queue<Integer> bq =new LinkedList<>();
        PriorityQueue<Integer> q = new PriorityQueue<>();
        PriorityQueue<Integer> rq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i = 0; i < operations.length; i++) {
    	   
    	  String[] result = operations[i].split(" ");
    	  
    	 if(result[0].equals("I")) {
         	bq.add(Integer.parseInt(result[1]));

    	 }
    	 
    	 if(result[0].equals("D") && result[1].equals("1")) {
			while(!bq.isEmpty()) {
				rq.add(bq.poll());
			}
			rq.poll();
			while(!rq.isEmpty()) {
 				bq.add(rq.poll());
 			}
		 }
    		 
		 if(result[0].equals("D") && result[1].equals( "-1")) {	
			while(!bq.isEmpty()) {
				q.add(bq.poll());
			}
 			q.poll();
 			while(!q.isEmpty()) {
 				bq.add(q.poll());
 			}
		 }
    	 
       }
       
       if(!bq.isEmpty()) {
    	   min = bq.peek();
    	   max = bq.peek();
    	   while(!bq.isEmpty()) {
    		   int tmp = bq.poll();
    		   if(max < tmp) {
    			   max = tmp;
    		   }
    		   if(min > tmp) {
    			   min = tmp;
    		   }
			}
    	   answer = new int[] {max, min};   
       }
        
        return answer;
    }
	
    public static void main(String[] args) {
        String arr1[] = {"I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"};
 
        HeapSolution03 sort = new HeapSolution03();

        System.out.println(sort.solution(arr1));

    }

}
