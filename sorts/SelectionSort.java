package sorts;

public class SelectionSort {

	private static void SelectionSortAlgo(int[] unsorted_array, int n) {
		// TODO Auto-generated method stub
		
		int smallest=0;
		for(int i=0;i<n;i++) {
			smallest = i;
			int j =i+1;
			while(j<n) {
				if(unsorted_array[j]<unsorted_array[smallest]) {// int arr[] = {66,8,3,22,4,34,5,7,3};
					smallest = j;
				}
				j++;
			}
			int temp = unsorted_array[i];
			unsorted_array[i]=unsorted_array[smallest];
			unsorted_array[smallest]=temp;
			
		}
		
	}
	
	public static void main(String[] args) {
		 int arr[] = {66,8,3,22,4,34,5,7,3};
		 
		 SelectionSortAlgo(arr,arr.length);
		 for(int i=0;i<arr.length;i++) {
				System.out.println(arr[i]);
			}
	}

	
}
