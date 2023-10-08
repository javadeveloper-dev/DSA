package com.Array.Sorting;



//Sort of Three types of elements using Dutch Flag Algorithm 
//Time Complexity is theta n and auxillary time complexity is theta 1
public class DutchNationalFlagAlgorithm {

	private static int[] sort(int[] arr, int n) {
		int l=0,h=n-1,mid=0;
		int temp=0;
		while(mid<=h) {
			if(arr[mid]==0) {
				temp=arr[l];
				arr[l]=arr[mid];
				arr[mid]=temp;
				mid++;
				l++;
			}else if(arr[mid]==1) {
				mid++;
			}else {
				temp=arr[mid];
				arr[mid]=arr[h];
				arr[h]=temp;
				h--;
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		int arr[]= {0,1,2,1,1,2};
		int n=arr.length;
		int result[]=DutchNationalFlagAlgorithm.sort(arr,n);
		for(Integer i:result) {
			System.out.println(i);
		}

	}


}
