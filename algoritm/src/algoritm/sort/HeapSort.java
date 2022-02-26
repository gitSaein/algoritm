package algoritm.sort;

public class HeapSort {


    //오름차순 정렬
    public static int descHeap(int[] arr, int pIdx){
            int lIdx = (pIdx * 2) + 1;
            int rIdx = (pIdx * 2) + 2;
            if(lIdx >= arr.length && rIdx >= arr.length){
                return 0;
            }

            // 왼쪽   자식 노드  p*2 + 1
            if (arr.length > lIdx && arr[pIdx] < arr[lIdx]) {
                pIdx = lIdx;
            }
            // 오른쪽 자식 노드   p*2 + 2
            if (arr.length > rIdx && arr[pIdx] < arr[rIdx]) {
                pIdx = rIdx;
            }

        return pIdx;
    }

    public static int[] swap(int[] arr, int pIdx, int tIdx){
        int tmp = arr[pIdx];
        arr[pIdx] = arr[tIdx];
        arr[tIdx] = tmp;
        return arr;
    }
    
    public static int[] makeHeap(int[] arr, int length) {
    	// 힙 만들
	    for (int i = 0; i < length / 2; i++) {
	    	int pIdx = descHeap(arr, i);
	        arr = swap(arr, i, pIdx);
	    }
	    return arr;
    }

    public static void main(String[] args){
        int []arr = {10,9,5,8,3,2,4,6,7,1};

        arr = makeHeap(arr, arr.length);

        
	    // 힙 정렬 
	    for(int i = arr.length-1; i > 0; i--) {
	    	arr = swap(arr, 0, i);
	        arr = makeHeap(arr, i-1);
	    	
	    }

        for(int j: arr){
            System.out.printf("%d, ", j);
        }
    }
}
