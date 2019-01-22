package algoritm.sort;

/*
 * Insertion Sort(삽입정렬)
 * time complexity : O(n)정렬시 ~O(n^2)
 * space complexity: O(n)
 */
public class InsertionSort {

	public int[] minSort(int[] arr) {
		for(int i = 0; i < arr.length - 1; i++) {
			for(int j = 0; j <= i; j++) {
				if(arr[i+1] <= arr[j]) {
					swap(arr, i+1, j);
				}
			}
		}
		return arr;
	}
	
	private void swap(int[] arr, int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {

		InsertionSort sort = new InsertionSort();
		int[] arr = {4,6,2,10,2,7};
		sort.minSort(arr);
	}
}
