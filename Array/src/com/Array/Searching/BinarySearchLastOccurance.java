package com.Array.Searching;

public class BinarySearchLastOccurance {
	
	private static int getLastOccurance(int[] arr, int low, int high, int x) {
	    if(low>high) {
	    	return -1;
	    }
	    int mid=(low+high)/2;
	    if(arr[mid]>x) {
	    	return getLastOccurance(arr,low,mid-1,x);
	    }else if(arr[mid]<x) {
	    	return getLastOccurance(arr,mid+1,high,x);
	    }else {
	    	if(mid!=arr.length-1 || arr[mid]!=arr[mid+1] || arr[mid]!=arr[arr.length-1]) {
	    		return mid;
	    	}else {
	    		return getLastOccurance(arr,mid+1,high,x);
	    	}
	    }
		
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,6};
		int low=0;
		int high=arr.length-1;
		int x=6;
		int result=BinarySearchLastOccurance.getLastOccurance(arr,low,high,x);
		System.out.println(result);
	}

}
