package com.Array.Searching;

public class TwoPointerApproach {
	   private static boolean getPair(int[] arr, int n,int x) {
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]+arr[j]==x) {
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
     int arr[]= {2,5,8,12,30};
     int x=17;
     int n=arr.length;
     boolean result=TwoPointerApproach.getPair(arr,n,x);
     System.out.println(result);

	}



}
