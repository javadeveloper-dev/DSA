package com.Array.Basic;
import java.util.*;
public class RearrrangeTheArray {

	private static int[] getArray(int[] arr, int n) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		Arrays.sort(arr);
		int i=0;
		while(i<=n/2) {
			
			list.add(arr[i]);
			list.add(arr[(n-1)-i]);
			i++;
			
		}
		System.out.println(list.size());
		int temp[]=new int[n];
		for(int j=0;j<n;j++) {
			temp[j]=list.get(j);
		}
		return temp;
	}
	public static void main(String[] args) {
		int arr[]= {3 ,3 ,11 ,15 ,20 ,11 ,6 ,5 ,15 ,1 ,19};
		int n=arr.length;
		int result[]=RearrrangeTheArray.getArray(arr,n);
		for(int i=0;i<n;i++) {
			System.out.print(result[i]+" ");
		}

	}


}
