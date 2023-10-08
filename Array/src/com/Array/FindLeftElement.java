package com.Array;

import java.util.Arrays;

public class FindLeftElement {
	private static int getElement(int[] arr, int size) {
		Arrays.sort(arr);
		
		return arr[size/2];
	}
	public static void main(String args[]) {
		int arr[]= {8,1,2,9,4,3,7,5};
		int size=arr.length;
		int result=FindLeftElement.getElement(arr,size);
		System.out.println(result);
	}

}
