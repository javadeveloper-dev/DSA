package com.Array.Searching;

import java.util.ArrayList;

public class FirstAndLastOccuranceOfX {
	private static ArrayList<Integer> getElements(int[] arr, int n, int x) {
		ArrayList<Integer> result=new ArrayList<Integer>();
		int low=0,high=n-1;
		int res1=-1,res2=-1;
		while(low<=high) {
			int mid=low+(high-low)/2;
			if(arr[mid]==x) {
				res1=mid;
				high=mid-1;
			}else if(arr[mid]<x) {
				low=mid+1;
			}else if(arr[mid]>x) {
				high=mid-1;
			}
		}
		
		low=0;
		high=n-1;
		while(low<=high) {
			int mid=low+(high-low)/2;
			if(arr[mid]==x) {
				res2=mid;
				low=mid+1;
			}else if(arr[mid]<x) {
				low=mid+1;
			}else if(arr[mid]>x) {
				high=mid-1;
			}
		}
		if(res1 >1 && res2>1) {
			result.add(res1);
			result.add(res2);
		}else {
			result.add(-1);
		}
		return result;
	}

	public static void main(String[] args) {
		int arr[]= {0,0,0,0,1,1,1,1};
		int n=arr.length;
		int x=3;
		ArrayList<Integer> list=FirstAndLastOccuranceOfX.getElements(arr,n,x);
		System.out.println(list);
	}


}
