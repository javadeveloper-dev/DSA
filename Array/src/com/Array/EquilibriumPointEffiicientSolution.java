package com.Array;

public class EquilibriumPointEffiicientSolution {

	private static boolean getSum(int[] arr, int n) {
		int res=0;
		for(int i=0;i<n;i++) {
			res+=arr[i];
		}
		int lsum=0;
		for(int i=0;i<n;i++) {
			res-=arr[i];
			if(lsum==res) {
				return  true;
			}
			lsum+=arr[i];
		}
		return false;
	}
	public static void main(String[] args) {
		int arr[]={3,4,8,-9,9,7};
		int n=arr.length;
		boolean result=EquilibriumPointEffiicientSolution.getSum(arr,n);
		System.out.println(result);

	}


}
