package com.Array.Sorting;

public class QuickSortUsingLomutoPartition {
	private int lomutoPartition(int[] arr, int l, int h) {
		int pivot=arr[h];
		int i=l-1;
		int temp=0;
		for(int j=l;j<=h-1;j++) {
			if(arr[j]<pivot) {
			i++;
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			}
		}
		temp=arr[i+1];
		arr[i+1]=arr[h];
		arr[h]=temp;
		return i+1;
	}
	
	private void quickSort(int[] arr, int l, int h) {
		if(l<h) {
			int p=lomutoPartition(arr,l,h);
			quickSort(arr,l,p-1);
			quickSort(arr,p+1,h);
		}
	}
	
	public static void main(String[] args) {
		int arr[]= {3,5,12,1,6,7,8};
		int n=arr.length;
		QuickSortUsingLomutoPartition quickSort=new QuickSortUsingLomutoPartition();
		quickSort.quickSort(arr,0,n-1);
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}
}
