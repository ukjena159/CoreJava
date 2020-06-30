package com.uk.array;

public class MultiAnonymousArray2 {
	public static void main (String []args){
		MultiAnonymousArray2.sum(new int[][]{{10,59,40},{30,40}});
	}
	public static void sum(int[][] no){
	int total=0;
	for( int[] x:no){
		for(int i:x){
			total=i+total;
		}
	}
	System.out.println("sum is:"+total);
	}

}
