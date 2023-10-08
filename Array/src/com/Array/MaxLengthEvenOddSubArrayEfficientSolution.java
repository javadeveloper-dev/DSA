package com.Array;

public class MaxLengthEvenOddSubArrayEfficientSolution {
	private static int getResult(int[] arr, int size) {
		int res=1;
		int curr=1;
		for(int i=1;i<size;i++) {
			if(arr[i]%2==0 && arr[i-1]%2!=0 || arr[i]%2!=0 && arr[i-1]%2==0) {
				curr++;
				res=Math.max(res, curr);
			}else {
				curr=1;
			}
		}
		return res;
	}
public static void main(String args[]) {
	int arr[]= {5,10,20,6,3,8};
	int size=arr.length;
	int result=MaxLengthEvenOddSubArrayEfficientSolution.getResult(arr,size);
	System.out.println(result);
}

}
