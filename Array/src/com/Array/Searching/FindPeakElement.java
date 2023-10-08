package com.Array.Searching;

class FindPeakElement {
	public static int getPeakElementFromArray(int[] arr, int n) {
	    int low=0, high=n-1;
	    while(low<=high) {
	    	int mid=(low+high)/2;
	    	if((mid==0 || arr[mid-1]<=arr[mid]) && (mid==n-1 || arr[mid+1]<=arr[mid])) {
	    		return arr[mid];
	    	}
	    	if(mid>0 && arr[mid-1]>=arr[mid]) {
	    		high=mid-1;
	    	}else {
	    		low=mid+1;
	    	}
	    }
		return 0;
	}

	public static void main(String[] args) {
		int arr[]= {10,7,8,20,12};
		int n=arr.length;
		int result=FindPeakElement.getPeakElementFromArray(arr,n);
		System.out.println("Result is "+result);

		
	}


}
