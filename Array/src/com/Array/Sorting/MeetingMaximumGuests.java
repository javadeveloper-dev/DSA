package com.Array.Sorting;

import java.util.Arrays;

public class MeetingMaximumGuests {
	private static int getMaximum(int[] arr, int[] dep, int n) {
		Arrays.sort(arr);
		Arrays.sort(dep);
		int i=1,j=0,res=1,curr=1;
		while(i<n && j<n) {
			if(arr[i]<=dep[j]) {
				i++;
				curr++;
			}else {
				j++;
				curr--;
			}
			res=Math.max(res, curr);
		}
		return res;
	}

	public static void main(String[] args) {
		int arr[]= {940,950,900,1800,1100,1500};
		int dep[]= {1200,1900,2000,1120,1130,910};
		int n=arr.length;
		int result=MeetingMaximumGuests.getMaximum(arr,dep,n);
		System.out.println(result);

	}

}
