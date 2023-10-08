package com.Array.Sorting;

public class InsertionSort {
	private static int[] getSortedArray(int[] arr, int n) {
		for(int i=1;i<n;i++) {
			int key=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
		return arr;
	}

	public static void main(String[] args) {
		int arr[]= {5,6,9,2,1,4,1};
		int n=arr.length;
		int result[]=InsertionSort.getSortedArray(arr,n);
		for(Integer i:result) {
			System.out.println(i);
		}
	}


}
