package com.Array;

public class CompeteTheSkills {
	private void getScore(long[] a, long[] b) {
		 int lcount=0;
	        int rcount=0;
	        for(int i=0;i<a.length;i++){
	            if(a[i]>b[i]){
	                lcount++;
	            }else{
	                rcount++;
	            }
	        }
	        System.out.print(lcount+" "+rcount);
		
	}
	public static void main(String args[]) {
		long a[]= {4,2,7};
		long b[]= {5,6,3};
		CompeteTheSkills competeSkills=new CompeteTheSkills();
		competeSkills.getScore(a,b);
	}

}
