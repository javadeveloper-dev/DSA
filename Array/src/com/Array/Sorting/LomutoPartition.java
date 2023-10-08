package com.Array.Sorting;

public class LomutoPartition {

	private static int[] getPartitionedArray(int[] arr, int low, int high) {
		int p=arr[high];
		int i=low-1;
		for(int j=low;j<=high-1;j++) {
			if(arr[j]<p) {
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		int temp=arr[i+1];
		arr[i+1]=arr[high];
		arr[high]=temp;
		return arr;
	}
	
	public static void main(String[] args) {
		int arr[]= {10,80,30,90,40,50,70};
		int n=arr.length;
		int high=n-1;
		int low=0;
		int result[]=LomutoPartition.getPartitionedArray(arr,low,high);
		for(int i:result) {
			System.out.print(i+" ");
		}
	}

}
