package com.Array.Sorting;

public class KthSmallestElement {
	private static int Partition(int[] arr, int l, int h) {
		
		int pivot=arr[h];
		int i=l-1;
		int temp=0;
		for(int j=l;j<=h-1;j++) {
			if(arr[j]<pivot) {
				i++;
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		temp=arr[i+1];
		arr[i+1]=arr[h];
		arr[h]=temp;
		return i+1;
	}
	private static int getSmallestElement(int[] arr, int k, int n) {
		int l=0,h=n-1;
		while(l<=h) {
			int p=Partition(arr,l,h);
			if(p==k-1) {
				return arr[p];
			}else if(p>k-1) {
				h=p-1;
			}else {
				l=p+1;
			}
			
		}
		return -1;
	}


	public static void main(String[] args) {
		int arr[]= {10,4,5,8,11,6};
		int n=arr.length;
		int k=5;
		int result=KthSmallestElement.getSmallestElement(arr,k,n);
		System.out.println(result);

	}


}
