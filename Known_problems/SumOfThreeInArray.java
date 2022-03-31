package test;

import java.util.Arrays;

public class SumOfThreeInArray {

	private static void sumArray(int[] arr, int sum) throws InterruptedException {
		int n = arr.length;
		System.err.println("===========Brute force approach(O(n3))========================");
		for (int i = 0; i < n; i++) { // Brute force approach
			for (int j = i+1; j < n ; j++) {
				for (int k = j+1; k < n ; k++) {
					int tempSum = arr[i] + arr[j] + arr[k];
					if (tempSum == sum) {
						System.out.println(arr[i] + ", " + arr[j] + ", " + arr[k]);
						break;
					}
				}
			}
		}
		Thread.sleep(1000);

	}

	private static void threeNumUsingSortedArray(int arr[], int sum) {
		System.err.println("=======================Sorting method============================");
		int n = arr.length;
		Arrays.sort(arr);
		for (int i = 0; i < n / 2; i++) {
			for (int j = n - 1; j > n / 2; j--) {
				int third = 0;
				if (sum < arr[i] + arr[j])
					third = (arr[i] + arr[j]) - sum;
				else {
					third = sum - (arr[i] + arr[j]);
					if (third == findThird(third, arr, n)) {
						System.out.println(arr[i] + ", " + arr[j] + ", " + third);
						break;
					}
				}
			}
		}

	}

	private static void EfficientWay(int[] arr, int sum) {
		System.err.println("=======================Efficient method============================");
		int n = arr.length;
		for(int i=0;i<n-2;i++) {
			int l = i+1;
			int h=n-1;
			while(l<h) {
				if(arr[i]+arr[l]+arr[h]==sum) {
					System.out.println(arr[i] + ", " + arr[l] + ", " + arr[h]);
					return;
				}else {
					if(arr[i]+arr[l]+arr[h]<sum) { // as this is sorted array
						l++;
					}else {
						h--;
					}
					
				}
			}
		}
	}

	private static int findThird(int third, int[] arr, int n) {

		for (int k = 0; k < n;k++) {
			if (arr[k] == third);
			return third;
		}
		return 0;
	}

	public static void main(String[] args) throws InterruptedException {
		int arr[] = { 4, 5, 1, 3, 2, 7, 9 }; // 1,2,3,4,5,7,9
		int sum = 18;
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		Thread.sleep(1000);
		sumArray(arr, sum);
		//threeNumUsingSortedArray(arr, sum);
		EfficientWay(arr, sum);

	}
}
