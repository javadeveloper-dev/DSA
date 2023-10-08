package com.Array.Searching;

public class SmallestLetterGreaterThanTarget {

	private static char getChar(char[] letters, char target, int n) {
		
	        if(letters[n-1]<=target || target<letters[0]){
	            return letters[0];
	        }
	        int low = 0, high = n - 1;
			char ans = letters[0];
			while (low + 1< high) {
				int mid = low + (high - low) / 2;
				if(letters[mid]<=target){
	                low=mid;
	            }else{
	                high=mid;
	            }
			}

			return letters[high];
	}

	public static void main(String[] args) {
		char[] letters = { 'c','f','j'};
		char target = 'd';
		int n = letters.length;
		char result = SmallestLetterGreaterThanTarget.getChar(letters, target, n);
		System.out.println(result);

	}

}
