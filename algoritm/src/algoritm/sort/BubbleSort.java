package algoritm.sort;

/*
 * Bubble Sorting
 * time complexity : O(n^2)
 * space complexity: O(n)
 */
public class BubbleSort {
	

	public int[] ascSort(int[] arr) {
		for(int i = 1; i < arr.length; i++) {
			for(int j = 0; j < arr.length-i; j++) {
				if(arr[j] > arr[j+1]) {
					swap(arr, j, j+1);
				}
			}
		}
		return arr;
	}
	
	private void swap(int[] arr,int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {

		int[] arr = {2,4,1,8,7,3};
		BubbleSort sort = new BubbleSort();
		sort.ascSort(arr);
		
	}

}
