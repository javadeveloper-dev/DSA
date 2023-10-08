package com.Array.Sorting;

public class CountingSort {
	private void sort(int[] arr, int n,int k) {
		int count[]=new int[k];
		for(int i=0;i<k;i++) {
			count[i]=0;
		}
		for(int i=0;i<n;i++) {
			count[arr[i]]++;
		}
		int index=0;
		for(int i=0;i<k;i++) {
			for(int j=0;j<count[i];j++) {
				arr[index]=i;
				index++;
			}
		}
		
	}

	public static void main(String[] args) {
		CountingSort csort=new CountingSort();
		int arr[]= {1,4,4,1,0,1};
		int k=5;
		int n=arr.length;
		csort.sort(arr,n,k);
		for(int i:arr) {
			System.out.print(arr[i]+" ");
		}

	}


}
