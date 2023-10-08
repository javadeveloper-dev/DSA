package com.Array.Sorting;

import java.util.ArrayList;
import java.util.List;

public class NaivePartitionOfArray {
	private static List<Integer> getPartitionInArrray(int[] arr, int p) {
		List<Integer> partition=new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<=p) {
				partition.add(arr[i]);
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>p) {
				partition.add(arr[i]);
			}
		}
		return partition;
	}

	public static void main(String[] args) {
		int arr[]= {3,6,7,8,12,10};
		int n=arr.length;
		int p=5;
		List<Integer> result=NaivePartitionOfArray.getPartitionInArrray(arr,p);
		for(Integer i:result) {
			System.out.print(i+" ");
		}
	}


}
