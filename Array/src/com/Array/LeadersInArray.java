package com.Array;

public class LeadersInArray {
	private void  leaders(int[] arr,int n) {
		boolean flag=false;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]<=arr[j]) {
					flag=true;
					break;
				}
				
				if(flag) {
					System.out.println(arr[i]);
				}
			}
		}
		
	}

	public static void main(String[] args) {
		LeadersInArray leader =new LeadersInArray();
		int arr[]= {7,10,4,10,6,5,2};
		int n=arr.length;
		leader.leaders(arr, n);
		
	}

	


}
