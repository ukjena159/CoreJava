package com.uk.duplicateArray;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElements {

	public static void main(String[] args) {
		int a[] = { 2, 4, 5, 6, 7, 8, 3, 2, 4, 6 };
		Set<Integer> s = new HashSet<>();
         for(int no:a){
        	 if(s.add(no)==false){
        		 System.out.println(no);
        	 }
         }
	}

}
