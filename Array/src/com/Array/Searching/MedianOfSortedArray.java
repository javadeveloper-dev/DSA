package com.Array.Searching;

import java.util.Arrays;

public class MedianOfSortedArray {

	private static int getMedian(int[] temp, int n) {
		int mid=n/2;
		if(n%2==0) {
			return (temp[mid]+temp[mid+1])/2;
		}else {
			return temp[mid];
		}
	}
	public static void main(String[] args) {
		int a1[]= {10,20,30,40,50};
		int a2[]= {5,15,25,35,45};
		int temp[]=new int[a1.length+a2.length];
		for(int i=0;i<a1.length;i++) {
			temp[i]=a1[i];
		}
		System.out.println(temp.length);
		for(int i=a1.length-1;i<temp.length;i++) {
			temp[i]=a2[i];
		}
		for(int i=0;i<temp.length;i++) {
			System.out.println(temp[i]);
		}
		Arrays.sort(temp);
		int n=temp.length;
		int result=MedianOfSortedArray.getMedian(temp,n);
		System.out.println(result);

	}


}
