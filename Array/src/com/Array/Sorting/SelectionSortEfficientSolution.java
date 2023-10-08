package com.Array.Sorting;

public class SelectionSortEfficientSolution {

	private static  int[]  getSelectionSort(int[] arr, int n) {
		int temp=0;
		for(int i=0;i<n;i++) {
			int min_value=i;
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[min_value]) {
					min_value=j;
				}
			}
			temp=arr[min_value];
			arr[min_value]=arr[i];
			arr[i]=temp;
		}
		return arr;
	}
	public static void main(String[] args) {
		int arr[]= {3,45,10,2,3,4};
		int n=arr.length;
		int result[]=SelectionSortEfficientSolution.getSelectionSort(arr, n);
		
		for(int x:arr) {
			System.out.println(x);
		}
	}


}
