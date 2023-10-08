package com.Array;

public class MoveAllZerosToEnd {

	private void allZerosToEnd(int[] arr, int n) {
		for(int i=0;i<n;i++) {
			if(arr[i]==0) {
				for(int j=i+1;j<n;j++) {
					if(arr[j]!=0) {
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
						
					}
				}
			}
			System.out.println("All Zeros to End are ");
			for(int k=0;i<arr.length;i++) {
				System.out.print(arr[k]);
			}
		}
		
	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,9,0,9,0,4,0,0,0,2,2};
		MoveAllZerosToEnd zerosToEnd = new MoveAllZerosToEnd();
		zerosToEnd.allZerosToEnd(arr,arr.length);
	}


}
