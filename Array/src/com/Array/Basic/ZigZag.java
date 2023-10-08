package com.Array.Basic;

import java.util.Arrays;

public class ZigZag {
	private void getResult(int[] arr, int n) {
		int temp=0;
		
		for(int i=1;i<=n-2;i+=2) {
			temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]);
		}
	}

	public static void main(String[] args) {
		int arr[]= {4,3,7,8,6,2,1};
		int n=arr.length;
		ZigZag zigzag=new ZigZag();
		zigzag.getResult(arr,n);

	}


}
