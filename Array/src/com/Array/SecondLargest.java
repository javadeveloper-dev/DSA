package com.Array;

public class SecondLargest {

	private static int getSecondLargest(int[] arr, int n) {
		int temp1=arr[0];
		int temp2=-1;
		for(int i=0;i<n;i++) {
			if(arr[i]>temp1) {
				temp1=arr[i];
			}
		}
		for(int i=0;i<n;i++) {
			if(arr[i]>temp2 && arr[i]<temp1) {
				temp2=arr[i];
			}
		}
		for (int i=0;i<n;i++) {
			if(arr[i]< temp1 && arr[i]<temp2) {
				
			}
		}
		System.out.println("Largesh Element is"+temp1);
		return temp2;
	}
	public static void main(String[] args) {
		int arr[]= {42,28,43,26,65,60,54,51,35,42,48,33,40,58,38,64,47,44,49,46,25,57,39,55,45,29,32,61,53,31,36,56,63,30,52,27,34,50,41,37,66,62,59};
		int result=SecondLargest.getSecondLargest(arr,arr.length);
		System.err.println("Second Largest Element is "+result);
	}


}
