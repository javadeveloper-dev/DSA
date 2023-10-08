package com.Array;

public class MaxConsecutiveOnesEfficient {
	private static int getMaxConsecutive(int[] arr, int n) {
		int res=0,curr=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]==0) {
				curr=0;
			}else {
				curr++;
				res=Math.max(curr, res);
			}
		}
		return res;
	}
	public static void main(String args[]) {
		int array[]= {0,1,1,1,0,1,1};
		int size=array.length;
		int result=MaxConsecutiveOnesEfficient.getMaxConsecutive(array,size);
		System.out.println(result);
	}

}
