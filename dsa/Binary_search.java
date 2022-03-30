package dsa;

import java.util.Arrays;

public class Binary_search {
	
	public static void main(String[] args) {
		
		int arr[]= {6,4,2,44,56,7,4,1,45,41,30,66,80,98};
		
		Arrays.sort(arr);
		System.out.println();
		//array after sorting arr[] = {}
		int l=0;
		int h=arr.length;
		int mid=0;
		int key = 56;
		while(l<=h) {
			
			mid=(l+h)/2;
			if(arr[mid]==key) {
				System.out.println(key +" is present at index:"+mid);
				return;
			}else if(arr[mid]<key) {
				l=mid+1;
			}else {
				h=mid-1;
			}
			
		}
		
	}

}
