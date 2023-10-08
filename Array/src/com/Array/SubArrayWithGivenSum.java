package com.Array;

public class SubArrayWithGivenSum {
	private static boolean getSum(int[] arr, int n, int sum) {
		for(int i=0;i<n;i++) {
			int s=0;
			for(int j=i;j<n;j++) {
				s+=arr[j];
				if(s==sum) {
					return true;
				}
			}
		}
		return false;
	}
	public static void main(String args[]) {
		int arr[]= {2,4};
		int n=arr.length;
		int sum=3;
		boolean result=SubArrayWithGivenSum.getSum(arr,n,sum);
		System.out.println(result);
	}

}
