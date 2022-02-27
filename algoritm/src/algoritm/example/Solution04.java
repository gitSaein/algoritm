package algoritm.example;


//문제: https://programmers.co.kr/learn/courses/30/lessons/42584
public class Solution04 {
	
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];;
        for(int i = 0; i < prices.length; i++){
            int cnt = 0;
            for(int j = i+1; j < prices.length; j++){
                cnt+=1;

                if(prices[j] < prices[i]){
                	break;
                }

            }
            answer[i] = cnt;
        }
        return answer;
    }
    
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 2, 3};
        Solution04 s = new Solution04();

        System.out.println(s.solution(arr1));

    }
	

}
