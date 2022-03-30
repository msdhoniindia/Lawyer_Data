package dsa;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Max_heap {

	
	private static void Max_heap_build(List<Integer> arr, int i) {
		int root = i;
		int left = 2 * i + 1;
		int right = 2 * i + 2;
		int n = arr.size();

		if (left < n && arr.get(root) < arr.get(left)) {
			root = left;
		}

		if (right < n && arr.get(root) < arr.get(right)) {
			root = right;
		}

		if (root!=i) {
			Collections.swap(arr, root, i);
			Max_heap_build(arr, root);
		}

	}

	public static void main(String[] args) {
		List<Integer> arr = Arrays.asList(10, 3, 5, 20, 30, 40);
		int n = arr.size();
		System.err.println(arr);
		for (int i = n / 2 - 1; i >= 0; i--) {
			Max_heap_build(arr, i);
		}
		

		System.out.println(arr);
	}

}
