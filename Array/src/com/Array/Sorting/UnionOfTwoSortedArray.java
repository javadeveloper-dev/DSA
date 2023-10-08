package com.Array.Sorting;

public class UnionOfTwoSortedArray {
	private void getUnionOfSortedArray(int[] a, int[] b, int m, int n) {
		int i=0,j=0;
		while(i<m && j<n) {
			if(i>0 && a[i]==a[i-1]) {
				i++;
				break;
			}
			if(j>0 && b[j]==b[j-1]) {
				j++;
				break;
			}
			if(a[i]<b[j]) {
				System.out.println(a[i]);
				i++;
			}else if(a[i]>b[j]) {
				System.out.println(b[j]);
				j++;
			}else {
				System.out.println(a[i]);
				i++;
				j++;
			}
		}
		
	}

	public static void main(String[] args) {
		int a[]= {2,3,4,5};
		int b[]= {3,4,5};
		int m=a.length;
		int n=b.length;
		UnionOfTwoSortedArray union=new UnionOfTwoSortedArray();
		union.getUnionOfSortedArray(a,b,m,n);
		

	}


}
