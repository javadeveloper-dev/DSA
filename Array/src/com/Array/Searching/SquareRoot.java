package com.Array.Searching;

public class SquareRoot {
	private static int getSquareRoot(int n) {
		int i=1;
		while(i*i<=n) {
			i++;
		}
		return i-1;
	}

	public static void main(String[] args) {
		int n=4;
		int result=SquareRoot.getSquareRoot(n);
		System.out.println(result);
	}


}
