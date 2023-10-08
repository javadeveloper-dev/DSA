package com.Array;

public class ReverseArray {

	private void reverseArray(int[] arr, int length) {
		int low=0,high=length-1;
		while(low<high) {
			int temp=arr[low];
			arr[low]=arr[high];
			arr[high]=temp;
			low++;
			high--;
		}
		for(int i=0;i<length;i++) {
			System.out.println(arr[i]);
		}
		
	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		ReverseArray array=new ReverseArray();
		array.reverseArray(arr,arr.length);
	}


}
