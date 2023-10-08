package com.Array;
import java.util.Scanner;
public class Deletion {
	private static int deletion(int[] arr, int size, int pos) {
		int n=size;
		int i=0;
		for( i=0;i<size;i++) {
			if(arr[i]==pos) {
				break;
			}
		}
			if(i==size) {
				return size;
			}
			for(int j=i;j<size-1;j++) {
				arr[j]=arr[j+1];
			}
		return n-1;
	}

	public static void main(String[] args) {
		System.out.println("Enter the size of array ");
		Scanner scanner=new Scanner(System.in);
		int size=scanner.nextInt();
		System.out.println("Enter the Array elements ");
		int arr[]=new int[size];
		for(int j=0;j<size;j++) {
			arr[j]=scanner.nextInt();
		}
		System.out.println("Enter the position which you want to delete element ");
		int position=scanner.nextInt();
		size=Deletion.deletion(arr,size,position);
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
