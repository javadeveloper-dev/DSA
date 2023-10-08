package com.Array.Basic;

public class FindImmediateSmallerElement {
	private void getSmallerElement(int[] arr, int n) {
		int temp=arr[0];
		for(int i=1;i<n;i++) {
			if(temp>arr[i]) {
				temp=arr[i];
				System.out.print(arr[i]+" ");
			}else {
				temp=arr[i];
				System.out.print(-1+" ");
			}
		}
		System.out.print(-1+" ");
		
	}
	public static void main(String args[]) {
		FindImmediateSmallerElement smallerElement= new FindImmediateSmallerElement();
		int arr[]= {4,2,1,5,3};
		int n=arr.length;
		smallerElement.getSmallerElement(arr,n);
	}

}
