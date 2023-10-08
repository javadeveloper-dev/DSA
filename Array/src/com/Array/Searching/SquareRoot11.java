package com.Array.Searching;

public class SquareRoot11 {
	private static int getSquareRoot(int x) {
		int low=1,high=x;
		while(low<=high) {
			int mid=low+(high-low)/2;
			if(mid<=x/mid) {
				low=mid+1;
			}else {
				high=mid-1;
			}
		}
		return high;
	}

	public static void main(String[] args) {
		int x=47;
		int result=SquareRoot11.getSquareRoot(x);
		System.out.println(result);
	}


}
