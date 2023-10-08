package com.Array;

public class FindIndex {
	private static int[] getIndex(int[] a, int N, int key) {
		
		int count=0;
		for(int i=0;i<N;i++) {
			if(a[i]==key) {
				int x[]= {i};
			}
		}
		return x;
	}
	public static void main(String args[]) {
		int a[]= {1,2,3,4,5,5};
		int N=a.length;
		int key=5;
		int result[]=FindIndex.getIndex(a,N,key);
		for(int i=0;i<result.length;i++) {
			System.out.print(result[i]+" ");
		}
	}

	}
