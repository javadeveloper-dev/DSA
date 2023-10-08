package com.Array;

public class EquilibriumPoint {

	private static boolean getEpoint(int[] arr, int n) {
		for(int i=0;i<n;i++) {
			int lsum=0,res=0;
			for(int j=0;j<i;j++) 
				lsum+=arr[i];
			
			for(int k=i+1;k<n;k++) 
				res+=arr[k];
			
			if(res==lsum) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int arr[]= {3,4,8,-9,9,7};
		int n=arr.length;
		boolean result=EquilibriumPoint.getEpoint(arr,n);
		System.out.println(result);
		

	}


}
