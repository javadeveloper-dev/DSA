package com.Array.Sorting;

public class InversionOfArray {
	private static int getInversion(int[] a, int n) {
		int count=0;
		for(int i=0;i<n-1;i++) {  //Iterate upto second last element because there is no element for comparision for right 
			for(int j=i+1;j<n;j++) {
				if(a[i]>a[j]) {
					count++;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int arr[]= {40,30,20,10};
		int n=arr.length;
		int result=InversionOfArray.getInversion(arr,n);
		System.out.println(result);
	}


}
