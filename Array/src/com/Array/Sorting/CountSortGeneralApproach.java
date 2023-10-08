package com.Array.Sorting;

public class CountSortGeneralApproach {
	private static int[] csort(int[] arr, int n, int k) {
		int count[]=new int[k];
		for(int i=0;i<k;i++) {
			count[i]=0;
		}
		for(int i=0;i<n;i++) {
			count[arr[i]]++;
		}
		// How many elements which less than or equal to n
		for(int i=1;i<k;i++) {
			count[i]=count[i-1]+count[i];
		}
		int output[]=new int[n];
		for(int i=n-1;i>=0;i--) {
			output[count[arr[i]]-1]=arr[i];
			count[arr[i]]--;
		}
		
		return output;
	}

	public static void main(String[] args) {
		int arr[]= {5,6,6,2};
		int n=arr.length;
		int k=7;
		int result[]=CountSortGeneralApproach.csort(arr,n,k);
		for(Integer i:result) {
			System.out.print(i+" ");
		}
	}


}
