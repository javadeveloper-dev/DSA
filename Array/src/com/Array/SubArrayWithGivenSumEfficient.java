package com.Array;

public class SubArrayWithGivenSumEfficient {
	private static boolean isSubArrayGivenSum(int[] arr, int n, int sum) {
		int curr=0;
		int s=0;
		for(int i=0;i<n;i++) {
			curr+=arr[i];
			while(sum<curr) {
				curr-=arr[s];
				s++;
			}
			if(curr==sum) {
				return true;
			}
		}
		return false;
	}
	public static void main(String args[]) {
		int arr[]= {4,8,12,5};
		int n=arr.length;
		int sum=17;
		boolean result=SubArrayWithGivenSumEfficient.isSubArrayGivenSum(arr,n,sum);
		System.out.println(result);
	}

}
