package com.Array.Searching;

import java.util.Arrays;

public class PairGivenDifference {
	private static boolean getDifference(int[] arr, int size, int n) {
		Arrays.sort(arr);
	      int i=0,j=0;
	      while(i<size && j<size) {
	    	  if(arr[j]-arr[i]==n) {
	    		  return true;
	    	  }
	    	  if(arr[j]-arr[i]<n) {
	    		  j++;
	    	  }else {
	    		  i++;
	    	  }
	      }
		return false;
	}

	public static void main(String[] args) {
		int arr[]= {5, 20, 3, 2, 5, 80};
		int size=arr.length;
		int n=78;
		boolean result=PairGivenDifference.getDifference(arr,size,n);
		System.out.println(result);

	}


}
