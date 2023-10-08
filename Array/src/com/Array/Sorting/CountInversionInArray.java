package com.Array.Sorting;

public class CountInversionInArray {
	private static int concquer(int[] arr, int l, int mid, int h) {
		int n1=mid-l+1;
		int n2=h-mid;
		int left[]=new int[n1];
		int right[]=new int[n2];
		for(int i=0;i<n1;i++) {
			left[i]=arr[l+i];
		}
		for(int j=0;j<n2;j++) {
			right[j]=arr[mid+1+j];
		}
		int res=0,i=0,j=0,k=l;
		while(i<n1 && j<n2) {
			if(left[i]<=right[j]) {
				arr[k++]=left[i++];
			}else {
				arr[k++]=right[j++];
				res=res+(n1-i);
			}
		}
		while(i<n1) {
			arr[k++]=left[i++];
		}
		while(j<n2) {			
			arr[k++]=right[j++];
		}
			
		return res;
	}
	private static int getInversion(int[] arr, int l, int h) {
		int res=0;
		if(l<h) {
			int mid=(l+h)/2;	
			res+=getInversion(arr,l,mid);
			res+=getInversion(arr,mid+1,h);
			res+=concquer(arr,l,mid,h);
		}
		return res;
	}
	public static void main(String[] args) {
	int arr[]= {2,4,1,3,5};
	int l=0;
	int h=arr.length-1;
	int result=CountInversionInArray.getInversion(arr,l,h);
	System.out.println(result);
	}

	

}
