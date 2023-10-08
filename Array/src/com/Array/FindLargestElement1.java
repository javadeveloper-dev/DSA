package com.Array;
import java.util.Scanner;
public class FindLargestElement1 {
	private static int getLargestElement(int[] arr) {
		int res=0;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>arr[res]) {
				res=i;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int result=FindLargestElement1.getLargestElement(arr);
		System.out.println("Largest Element index is "+result);
	}


}
