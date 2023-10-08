package com.Array;

public class SecondLargestArray {
	private static int findSecondLargestArray(int[] arr, int n) {
		int temp=arr[0];
		int x=0;
		for(int i=1;i<arr.length;i++) {
			if(temp<arr[i]) {
				x=temp;
				temp=arr[i];
			}
			
			
		}
		return x;
	}
public static void main(String args[]) {
	int arr[]= {10,5,10};
	int n=arr.length;
	int result=SecondLargestArray.findSecondLargestArray(arr,n);
	System.out.println("Second Largest No is "+result);
}

}
