package com.Array.Searching;

public class TripletSumEfficient {
	private static boolean isPair(int[] arr,int y, int si, int n) {
		int i=si,j=n-1;
		while(i<j) {
			if(arr[i]+arr[j]==y) {
				return true;
			}else if(arr[i]+arr[j]<y) {
				i++;
			}else {
				j--;
			}
		}
		return false;
	}
	private static boolean getSum(int[] arr, int n, int x) {
		for(int i=0;i<n-2;i++) {
			if(isPair(arr,x-arr[i],i+1,n)) {
				return true;
			}
		}
		return false;
	}


	public static void main(String[] args) {
		int arr[]= {2,5,10,15,18};
		int n=arr.length;
		int x=33;
		boolean result=TripletSumEfficient.getSum(arr,n,x);
		System.out.println(result);

	}


}
