package com.Array.Sorting;

public class SegregateNegativePositiveNos {

	private static int[] getSegregatePosNeg(int[] arr, int n) {
		int i=-1,j=n;
		while(true) {
			do {
				i++;
			}while(arr[i]<0);
			do {
				j--;
			}while(arr[j]>0);
			if(i>=j) {
				return arr;
			}
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
	}
	public static void main(String[] args) {
		int arr[]= {4,5,-1,-2};
		int n=arr.length;
		int result[]=SegregateNegativePositiveNos.getSegregatePosNeg(arr,n);
		for(Integer i:result) {
			System.out.println(i);
		}

	}


}
