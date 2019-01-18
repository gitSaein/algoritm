package algoritm.sort;

/*
 * Min-Selection: asc
 * Max-Selection: desc 
 * (가장작은,큰 값을 찾아간다.의 과정을 반복)
 * time complexity : O(n^2)
 * space complexity: O(n)
 */
public class SelectionSort {
	

	public int[] minSort(int[] sortArr) {
		
		int min = 0;
		for(int i = 0; i < sortArr.length-1; i++) {
			for(int j = i; j<sortArr.length; j++) {
				 if( sortArr[j] < sortArr[min]) {
					 min = j;
				 }
			}
			
			swap(sortArr, i, min);
		}
		return sortArr;
	}
 	
 	private void swap(int[] arr, int pivot, int minIndex) {
 		int temp = arr[minIndex];
 		arr[minIndex] = arr[pivot];
 		arr[pivot] = temp;
 	}
 	
 	public static void main(String[] args) {
 		SelectionSort sort = new SelectionSort();
 		int[] arr = {33,5,6,4,3,5};
 		sort.minSort(arr);
 	}
	
}
