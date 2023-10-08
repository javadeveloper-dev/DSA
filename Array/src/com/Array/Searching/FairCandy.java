package com.Array.Searching;

import java.util.HashSet;

public class FairCandy {
	private static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
		 HashSet<Integer> set=new HashSet<Integer>();
	        for(int i=0;i<aliceSizes.length;i++){
	            for(int j=0;j<bobSizes.length;j++){
	                if(aliceSizes[i]<bobSizes[j] ){
	                    set.add(aliceSizes[i]);
	                }
	            }
	        }
	        int x=0;
	        int ans[]=new int[set.size()];
	        for(Integer i:set){
	            ans[x]=i;
	            x++;
	        }
	        return ans;
	}

	public static void main(String[] args) {
	int aliceSizes[]= {1,1};
	int bobSizes[]= {2,2};
	int result[]=FairCandy.fairCandySwap(aliceSizes,  bobSizes);
	for(Integer i:result) {
		System.out.println(i);
	}
	}


}
