package com.Array.Sorting;

public class QuickSortUsingHoaresPartition {

	private int partition(int[] arr, int l, int h) {
		int pivot=arr[l];
		int i=l-1,j=h+1;
		while(true) {
			do {
				i++;
			}while(arr[i]<pivot);
			do {
				j--;
			}while(arr[j]>pivot);
			if(i>=j) {
				return j;
			}
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
	}
	private void quickSort(int[] arr, int l, int h) {
		if(l<h) {
			int p=partition(arr,l,h);
			quickSort(arr,l,p);
			quickSort(arr,p+1,h);
		}
		
	}
	public static void main(String[] args) {
		QuickSortUsingHoaresPartition quickHoares=new QuickSortUsingHoaresPartition();
		int arr[]= {44,3,2,66,7,8};
		quickHoares.quickSort(arr,0,arr.length-1);
		for(int i:arr) {
			System.out.print(i+" ");
		}

	}


}
