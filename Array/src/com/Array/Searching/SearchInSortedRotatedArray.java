package com.Array.Searching;

public class SearchInSortedRotatedArray {
	private static int getElement(int[] arr, int low, int high,int x) {
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]==x) {
				return mid;
			}
			if(arr[low]<arr[mid]) {
				if(x>=arr[low] && x<arr[mid]) {
					high=mid-1;
				}else {
					low=mid+1;
				}
			}else {
				if(x>arr[mid] && x<=arr[high]) {
					low=mid+1;
				}else {
					high=mid-1;
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,9,8};
		int x=9;
		int low=0;
		int high=arr.length-1;
		int result=SearchInSortedRotatedArray.getElement(arr,low,high,x);
		System.out.println(result);

	}

}
