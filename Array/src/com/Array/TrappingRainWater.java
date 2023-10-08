package com.Array;

public class TrappingRainWater {
	private static int getRainWater(int[] arr2, int n) {
		int res=0;
		for(int i=1;i<n;i++) {
			int lMax=arr2[i];
			for(int j=0;j<i;j++) {
				lMax=Math.max(lMax, arr2[j]);
			}
			int rMax=arr2[i];
			for(int j=i+1;j<n;j++) {
				rMax=Math.max(rMax, arr2[j]);
			}
			res+=Math.min(lMax, rMax)-arr2[i];
		}
		return res;
	}
	public static void main(String args[]) {
	int arr[]= {3,0,1,2,5};
	int result=TrappingRainWater.getRainWater(arr,arr.length);
	System.out.println(result);
}
}