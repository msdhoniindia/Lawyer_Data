package sorts;

import java.util.Iterator;

public class QuickSort {
	
	private static void Quick_sort(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		int l =i;
		int h =j;
		
		if(l<h) {
		int pivot = Partition(arr,l,h);
		System.err.println("pivot="+pivot);
		Quick_sort(arr, l, pivot-1);
		Quick_sort(arr, pivot+1,h);
		}
	}

	private static int Partition(int arr[],int l, int h) {
		// TODO Auto-generated method stub
		int i =l;
		int j =h;
		int pivot = arr[l];
		while(i<j) {
			
			while(arr[i]<=pivot) { //{4,6,1,5,17,13,20,9};
				//System.err.println("i="+l+" j="+j);
				i++;
			}
			while(arr[j]>=pivot) j--;
			 	
			System.err.println("i="+l+" j="+j);
			if(i<j) {
				int temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			
		}
		if(j!=l) {
			int m = arr[j];
			arr[j]=arr[l];
			arr[l]=m;
		}
		
		return j;
	}

	
	public static void main(String[] args) {
		int arr[] = {6,1,5,17,4,13,20,9};//1,4,5,6,9,13,17,20
		
		Quick_sort(arr,0,arr.length-1);
		for(int i = 0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}

	

}
