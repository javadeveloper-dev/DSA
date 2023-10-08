package com.Array.Basic;

public class SumArrayPuzzle {
	private static int[] getSum(int[] arr, int n) {
		int i=0;
        int temp[]=new int[n];
        while(i<n){
        	int x=0;
            int sum=0;
            for(int j=0;j<n;j++){
                if(j!=i){
                    sum+=arr[j];
                }
            }
            temp[i]=sum;
            i++;
        }
		return temp;
	}

	public static void main(String[] args) {
	 int arr[]= {3,6,4,8,9};
	 int n=arr.length;
	 int result[]=SumArrayPuzzle.getSum(arr,n);
	 for(int i=0;i<n;i++) {
		 System.out.print(result[i]+" ");
	 }
	}


}
