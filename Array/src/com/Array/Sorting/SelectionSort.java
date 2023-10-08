package com.Array.Sorting;

public class SelectionSort {
	private static int[] getSortedArray(int[] arr, int n) {
		int temp[]=new int[n];
		for(int i=0;i<n;i++) {
			int min_value=0;
			for(int j=1;j<n;j++) {
				if(arr[j]<arr[min_value]) {
					min_value=j;
				}
			}
			temp[i]=arr[min_value];
			arr[min_value]=Integer.MAX_VALUE;
		}
		for(int i=0;i<n;i++) {
			arr[i]=temp[i];
		}
		return arr;
	}

	public static void main(String[] args) {
     int arr[]= {5,7,9,1,2,4};
     int n=arr.length;
     int result[]=SelectionSort.getSortedArray(arr,n);
     for(Integer i:result) {
    	 System.out.println(i);
     }

	}


}
