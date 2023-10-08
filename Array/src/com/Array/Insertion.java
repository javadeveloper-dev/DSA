package com.Array;
import java.util.Scanner;
public class Insertion {
	private static int insert(int[] arr, int pos, int x,int size,int n) {
		if(arr.length==pos || arr.length<pos) {
			System.out.println("We cannot perform insertion operation");
		}
		int index=pos-1;
		for(int i=n-1;i>=pos-1;i--) {
			arr[i+1]=arr[i];
		}
		arr[index]=x;
		return n+1;
	}
public static void main(String args[]) {
	int size=5;
	int pos=2;
	int x=33;
	int n=4;
	int arr[]=new int[size];
	arr[0]=23;
	arr[1]=45;
	arr[2]=33;
	arr[3]=34;
	int result=Insertion.insert(arr,pos,x,size,n);
	System.out.println("Array After insertion is ");
	for(int i=0;i<result;i++) {
		System.out.print(arr[i]+" ");
	}
}

}
