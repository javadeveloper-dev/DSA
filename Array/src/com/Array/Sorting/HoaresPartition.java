package com.Array.Sorting;

public class HoaresPartition {
	private void getPartitionedArray(int[] arr, int low, int high) {
		int pivot=arr[low];
		int i=low-1;
		int j=high+1;
		while(true) {
			do {
				i++;
			}while(arr[i]<pivot);
			do {
				j--;
			}while(arr[j]>pivot);
			if(i>=j) {
				break;
			}
			if(arr[i]!=arr[j]) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			}
		}
	}
	public static void main(String[] args) {
		int arr[]= {5,5,5,5,5,5};
		int n=arr.length;
		int high=n-1;
		int low=0;
		HoaresPartition hoaresPartition=new HoaresPartition();
		hoaresPartition.getPartitionedArray(arr,low,high);
		for(int i:arr) {
			System.out.print(i+" ");
		}
		}
}
