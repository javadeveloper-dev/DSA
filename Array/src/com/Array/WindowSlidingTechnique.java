package com.Array;

public class WindowSlidingTechnique {
	private static int getSum(int[] arr, int n, int k) {
		int res=Integer.MIN_VALUE;
		for(int i=0;i+k-1<n;i++) {
			int curr=0;
		for(int j=0;j<k;j++) {
			curr+=arr[i+j];
		}
		res=Math.max(res, curr);
		}
		return res;
	}
public static void main(String args[]) {
	int arr[]= {1,8,30,-5,20,7};
	int n=arr.length;
	int k=3;
	int result=WindowSlidingTechnique.getSum(arr,n,k);
	System.out.println(result);
}

}
