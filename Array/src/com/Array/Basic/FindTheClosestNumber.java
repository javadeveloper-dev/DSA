package com.Array.Basic;

public class FindTheClosestNumber {
	private static int getResult(int[] arr, int n,int target) {
		 int res=0;
		 int temp=0;
		 for(int i=0;i<n;i++) {
			 res=Math.abs(target-arr[i]);
			 temp=Math.max(temp,res);
		 }
		return temp;
	}

	public static void main(String[] args) {
		   int arr[]= {1,4,4,5,6,7,7,9,10,10,10,11,11,12,13,15,15,19,19};
		   int n=arr.length;
		   int target=10;
		   int result=FindTheClosestNumber.getResult(arr,n,target);
		   System.out.println(result);
		   

	}


}
