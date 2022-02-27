package algoritm.example;
import java.util.PriorityQueue;


// 문제: https://programmers.co.kr/learn/courses/30/lessons/42626
public class HeapSolution01 {
    public int solution(int[] scoville, int K) {

    	int answer = 0;
    	PriorityQueue<Integer> q = new PriorityQueue<>();
    	for(int s : scoville) {
    		q.add(s);
    	}
    	
    	while(q.peek() < K) {
    		if(q.size() == 1) return -1;
            int first = q.poll();
            int second = q.poll();
            int mix = first + 2*second;
    		q.add(mix);
            answer+=1;
    	}
    	
    	return answer;
    }
}
