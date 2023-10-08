package com.Array.Searching;

public class TripletSum {
	private static boolean getSum(int[] arr, int n,int x) {
		for(int i=0;i<n-2;i++) {
			for(int j=i+1;j<n-1;j++) {
				for(int k=j+1;k<n;k++) {
					if(arr[i]+arr[j]+arr[k]==x) {
						return true;
					}
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int arr[]= {2,3,4,8,9,20,40};
		int n=arr.length;
		int x=32;
		boolean result=TripletSum.getSum(arr,n,x);
		System.out.println(result);

	}


}
