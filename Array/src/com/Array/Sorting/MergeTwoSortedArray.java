package com.Array.Sorting;

public class MergeTwoSortedArray {
	private void getSortedArray(int[] a1, int[] b1, int m, int n) {
		int i=0,j=0;
		while(i<m && j<n) {
			if(a1[i]<b1[j]) {
				System.out.println(a1[i++]);
			}else {
				System.out.println(b1[j++]);
			}
		}
		while(i<m) {
			System.out.println(a1[i++]);
		}
		while(j<n) {
			System.out.println(b1[j++]);
		}
		
		
	}

	public static void main(String[] args) {
		int a1[]= {2,4,6,7};
		int b1[]= {1,3,5,8};
		int m=a1.length;
		int n=b1.length;
		MergeTwoSortedArray merge=new MergeTwoSortedArray();
		merge.getSortedArray(a1,b1,m,n);
		
	}


}
