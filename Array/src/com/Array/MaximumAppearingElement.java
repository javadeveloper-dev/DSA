package com.Array;

public class MaximumAppearingElement {

	private static int getMax(int[] left, int[] right, int n) {
		int freq[]=new int[100];
		for(int i=0;i<n;i++) {
			for(int j=left[i];j<right[i];j++) {
				freq[j]+=1;
			}
			
		}
		int result=0;
		for(int i=0;i<n;i++) {
			if(freq[i]>freq[result]) {
				result=i;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		int arr1[]= {1,2,4};
		int arr2[]= {4,5,7};
		int n=arr1.length;
		int result=MaximumAppearingElement.getMax(arr1,arr2,n);
		System.out.println(result);
	}


}
