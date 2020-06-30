package com.uk.array;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		int[][][] a = { { { 20, 50, 89 }, { 30, 60, 98, 54, 24 }, { 10, 83, 24, 68, 95 } } };
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				for (int k = 0; k < a[i][j].length; k++) {
					System.out.print(a[i][j][k] + " ");
				}
				System.out.println();
			}
		}
	}

}
