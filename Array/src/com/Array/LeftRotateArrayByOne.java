package com.Array;

public class LeftRotateArrayByOne {
	private void leftRotationByOne(int[] arr, int length) {
		int first = arr[0];
		for (int i = 0; i < length - 1; i++) {
			arr[i] = arr[i + 1];
		}
		arr[length - 1] = first;
		for (int j = 0; j < length; j++) {
			System.out.print(arr[j] + " ");
		}
	}

	public static void main(String[] args) {
		int arr[] = { 30, 5, 20 };
		LeftRotateArrayByOne leftRotation = new LeftRotateArrayByOne();
		leftRotation.leftRotationByOne(arr, arr.length);
	}

}
