package com.Array.Sorting;

public class PartitionInArrayUsingTempArray {
	private static int[] getPartitionedArray(int[] arr, int l, int h, int p) {
		int temp[]=new int[h];
		int index=0;
		for(int i=l;i<h;i++) {
			if(arr[i]<=arr[p]) {
				temp[index]=arr[i];
				index++;
			}
		}
		for(int i=l;i<h;i++) {
			if(arr[i]>arr[p]) {
				temp[index]=arr[i];
				index++;
			}
		}
		return temp;
	}
	public static void main(String[] args) {
		int arr[]= {5,13,6,9,12,11,8};
		int l=0;
		int h=arr.length;
		int p=h-1;
		int result[]=PartitionInArrayUsingTempArray.getPartitionedArray(arr,l,h,p);
		for(int i=0;i<h;i++) {
			System.out.print(result[i]+" ");
		}
	}

}
