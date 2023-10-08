package com.Array.Sorting;

import java.util.*;

public class PartitionInAGivenArray {
	private static List<Integer> getPartionInArray(int[] a, int n,int p) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<n;i++) {
			if(a[i]<=p) {
				list.add(a[i]);
			}
		}
		for(int i=0;i<n;i++) {
			if(a[i]>p) {
				list.add(a[i]);
			}
		}
		
		return list;
	}

	public static void main(String[] args) {
	int arr[]= {3,8,6,12,10,7};
	int p=7;
	int n=arr.length;
	List<Integer> list=PartitionInAGivenArray.getPartionInArray(arr,n,p);
	System.out.println(list);

	}


}
