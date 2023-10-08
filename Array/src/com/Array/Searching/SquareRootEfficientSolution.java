package com.Array.Searching;

public class SquareRootEfficientSolution {
	private static int getSquareRoot(int x) {
		int low=1,high=x,ans=1;
		while(low<=high) {
			int mid=(low+high)/2;
			int msq=mid*mid;
			if(msq==x) {
				return mid;
			}else if(msq>x) {
				high=mid-1;
			}else {
				low=mid+1;
				ans=mid;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		int x=10;
		int result=SquareRootEfficientSolution.getSquareRoot(x);
		System.out.println(result);

	}


}
