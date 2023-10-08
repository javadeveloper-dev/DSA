package com.Array.Sorting;
//This is Efficient Version of Bubble Sort 
// Time Complexity of this Algorithm is O(n)
//This solution is applicable for only if array is partially
//sorted or complete sorted.
public class BubbleSortEfficientSolution {
	private static int[] sortArray(int[] arr, int n) {
		int temp=0;
		for(int i=0;i<n-1;i++) {
			boolean flag=false;
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=true;
				}
			}
			if(flag==false) {
				break;
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,8,7,6};
		int n=arr.length;
		int result[]=BubbleSortEfficientSolution.sortArray(arr,n);
		for(int i:result) {
			System.out.print(i+" ");
		}
	}


}
