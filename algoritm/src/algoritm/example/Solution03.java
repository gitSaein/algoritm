package algoritm.example;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Solution03 {
	public int solution(int bridge_length, int weight, int[] truck_weights) {

		int answer = 0;
        int total = 0;
        int cnt = 0;
        Queue<Integer> terminalQ = new LinkedList<>();
        Arrays.sort(truck_weights);
        
        int i = 0;
        do{
    	   if(total <= weight){
        	   total += truck_weights[i];
        	   terminalQ.add(truck_weights[i]);

    	   } else {
        	   i++;
        	   if(!terminalQ.isEmpty()) {
        		   
        	   }
    	   }
    	   cnt++;
        }while(!terminalQ.isEmpty());
        
        
        return answer;
    }
	
	  public static void main(String[] args) {
	        int arr1[] = {7,4,5,6};
	        Solution03 sort = new Solution03();

	        System.out.println(sort.solution(2, 10, arr1));

	    }
}
