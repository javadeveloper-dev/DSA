package com.Array.Sorting;

public class Sample {

	public static void main(String[] args) {
		int arr[]= {99,88,77,66,55,44,33,22,11};
		int n=arr.length;
		int min_value=0;
		for(int i=0;i<n;i++) {
			min_value=i;
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[min_value]) {
					min_value=j;
				}
			}
			int temp=arr[min_value];
			arr[min_value]=arr[i];
			arr[i]=temp;
		 

	}
	for(Integer i:arr) {
		System.out.println(i);
	}
}
}
