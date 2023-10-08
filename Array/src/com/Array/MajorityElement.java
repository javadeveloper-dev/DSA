
package com.Array;

public class MajorityElement {
	private static int getElement(int[] arr, int size) {
		
		int x = 0;
		for (int i = 0; i < size; i++) {
			int count = 1;
			for (int j = i + 1; j < size; j++) {
				if (arr[i] == arr[j]) {
					x = j;
					count++;
				}
				if (count > arr.length/2) {
					return i;
				}
			}
		}
		return -1;
	}

	public static void main(String args[]) {
		int arr[] = { 8,7,6,8,6,6,6,6 };
		int size = arr.length;
		int result = MajorityElement.getElement(arr, size);
		System.out.println(result);
	}

}
