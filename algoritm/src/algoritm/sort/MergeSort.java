package algoritm.sort;

/*
 * Min-Selection: asc
 * Max-Selection: desc 
 * (분할과정과 합병과정을 반복)
 * time complexity : O(nlogn)
 * space complexity: O(n)
 */
public class MergeSort {
	

 	private void swap(int[] arr, int left, int right) {
 		int temp = arr[left];
 		arr[left] = arr[right];
 		arr[right] = temp;
 	}
 	
 	private void merge(int[] arr,int left, int right) {
 		int mid = (left + right)/2;
 		while(mid != 0) {
 			
 		}
 		

 	}
 	
 	private void sort(int[] arr, int left, int mid, int right) {
 		
 		if(arr[left] > arr[right]) {
 			this.swap(arr, left, right);
 		}else {
 			left = right + 1;
 		}
 	}
 	
 	private void divide(int[] arr, int left, int right, int mid) {

 		while(mid != 0) {
 			right = mid;
 		}
 		
 	}
 	public static void main(String[] args) {
 		MergeSort sort = new MergeSort();
 		int[] arr = {33,5,6,4,3,5};
 		int left = 0;
 		int right = arr.length - 1;
 		sort.merge(arr, left, right);
 	}
	
}
