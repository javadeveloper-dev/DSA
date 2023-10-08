package com.Array.Sorting;

public class CycleSort {
	private static int[] getDistinctCycleSort(int[] arr, int n) {
		int temp=0,item=0,cs,pos=0;
		for(cs=0;cs<n-1;cs++) {
			 item=arr[cs];
			 pos=cs;
			for(int i=cs+1;i<n;i++)
				if(arr[i]<item) 
					pos++;
			 temp=arr[pos];
			 arr[pos]=item;
			 item=temp;
		while(cs!=pos) {
			pos=cs;
			for(int i=cs+1;i<n;i++) 
				if(arr[i]<item) 
					pos++;
			temp=arr[pos];
			arr[pos]=item;
			item=temp;
		}
		}
		return arr;
	}

	public static void main(String[] args) {
		int arr[]= {5,4,3,2,1};
		int n=arr.length;
		int result[]=CycleSort.getDistinctCycleSort(arr,n);
		for(int i:result) {
			System.out.print(i+" ");
		}

	}


}
