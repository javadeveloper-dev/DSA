package com.Array.Sorting;

public class IntersectionOfTwoSortedArray {

	private void getIntersectionArray(int[] a, int[] b, int m, int n) {
	int i=0,j=0;
	while(i<m && j<n) {
		if(i>0 && a[i]==a[i-1]) {
			i++;
			continue;
		}
		if(a[i]<b[j]) {
			i++;
		}else if(a[i]>b[j]) {
			j++;
		}else {
			System.out.println(a[i]);
			i++;
			j++;
		}
	}
	}
	public static void main(String[] args) {
		int a[]= {3,4,5,6,7};
		int b[]= {4,5,7,8,9};
		int m=a.length;
		int n=b.length;
		IntersectionOfTwoSortedArray intersection=new IntersectionOfTwoSortedArray();
		intersection.getIntersectionArray(a,b,m,n);
	}


}
