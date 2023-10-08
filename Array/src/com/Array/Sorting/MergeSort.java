package com.Array.Sorting;

public class MergeSort {
	 
    static void merge(int arr[], int l, int m, int h){
    
        int n1=m-l+1, n2=h-m;
        int[] left=new int[n1];int[]right=new int[n2];
        for(int i=0;i<n1;i++)
            left[i]=arr[i+l];  // Copy the first half array purpose of i+l is low might not be 0 all the time (call intermediate subarray)
        for(int j=0;j<n2;j++)
            right[j]=arr[m+1+j];    // Copy the second half array
        int i=0,j=0,k=l;
        while(i<n1 && j<n2){
            if(left[i]<=right[j])
                arr[k++]=left[i++];
            else
                arr[k++]=right[j++];
        }
        while(i<n1)  // IF element are remaining in the left array
            arr[k++]=left[i++];
        while(j<n2)  // If the element are remaining in right array 
            arr[k++]=right[j++];    
    }
    
    static void mergeSort(int arr[],int l,int r){
        if(r>l){
            int m=l+(r-l)/2;
            mergeSort(arr,l,m);
            mergeSort(arr,m+1,r);
            merge(arr,l,m,r);
        }
    }

	public static void main(String[] args) {
		int a[] = new int[]{2,8,43,5,8,4};
	    int l=0,r=a.length-1;
        
        mergeSort(a,l,r);
    	for(int x: a)
	        System.out.print(x+" ");
	}

}
