package com.Array;

public class MaximumDifference {
	private void max(int[] arr, int n) {
		int temp=arr[1]-arr[0];
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[j]>arr[i] && arr[j]-arr[i]>temp) {
					temp=arr[j]-arr[i];
					System.out.println(temp);
				}
			}
		}
		
	}
public static void main(String args[]) {
	MaximumDifference maxDifference=new MaximumDifference();
	int arr[]= {2, 3, 10, 6, 4, 8, 1};
	int n=arr.length;
	maxDifference.max(arr,n);
	
}

}
