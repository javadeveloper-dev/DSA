package com.Array;

public class TrappingRainWaterEfficientSolution {
	private static int getWater(int[] arr2, int n) {
		int res=0;
		int lMax[]=new int[n];
		int rMax[]=new int[n];
		lMax[0]=arr2[0];
		for(int i=1;i<n;i++) {
			lMax[i]=Math.max(arr2[i], lMax[i-1]);
		}
		rMax[n-1]=arr2[n-1];
		for(int j=n-2;j>=0;j--) {
			rMax[j]=Math.max(arr2[j], rMax[j+1]);
		}
		for(int i=1;i<n-1;i++) {
			res+=Math.min(lMax[i], rMax[i])-arr2[i];  // we cannot store water on corner bar.
	}
		return res;
	}
	public static void main(String args[]) {
	int arr[]= {5,0,6,2,3};
	int result=TrappingRainWaterEfficientSolution.getWater(arr,arr.length);
	System.out.println(result);		
	}
}
