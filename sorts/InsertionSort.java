package sorts;

public class InsertionSort {

	private static void InsertionSortAlgo(int[] arr, int length) {
		// TODO Auto-generated method stub

		for (int i = 1; i < length; i++) { // going forward
			int temp = arr[i];
			int j = i - 1;

			while (j >= 0 && arr[j] > temp) { //Going Backward
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = temp;
		}
	}

	public static void main(String[] args) {

		int arr[] = { 5, 2, 11, 44, 3, 9, 7 };
		InsertionSortAlgo(arr, arr.length);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
