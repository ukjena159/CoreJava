package com.uk.duplicateArray;

public class DuplicateArray {

	public static void main(String[] args) {
		int a[] = { 2, 3, 3, 5, 7, 9, 6, 9 };
		for (int i = 0; i < a.length; i++)
			
		{
			for(int j=i+1;j<a.length;j++){
				if(a[i]==a[j] && i!=j){
					System.out.println(a[j]);
				}
			}
		}
	}

}
