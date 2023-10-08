package com.Array.Basic;

public class DigitsInASet {

	private static int getResult(int n) {
		int count=0;
	       for(int i=1;i<=n;i++){
	           if(i<=5){
	               count++;
	           }
	           if(i%10<=5 && i/10<=5  && 1%10!=0 && i>10){
	               count++;
	           }
	       }
	       return count;
		
	}
	public static void main(String[] args) {
	int n=20;
	int result=DigitsInASet.getResult(n);
	System.out.println(result);
	}


}
