
public class SelectionSort implements SortingAlgorithm {

	public void sort(int [] a) {

		for(int i = 0; i < a.length; i++) {
			swap(i, findMin(i,a),a);
		}
	}

	public void swap(int a, int b, int [] arr) {

		int temp = arr[a];
		arr[a] = arr[b];
		arr[b]=temp;
	}

	public int findMin(int i, int [] arr) {

		int min = i;
		for(int k = i+1; k < arr.length; k++) {
			if(arr[k] < arr[min]) {
				min=k;
			}
		}
		return min;
	}
}