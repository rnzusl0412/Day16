package com.test01;

public class ARTest06 {
	public static void main(String[] args) {
		int[][] ar = new int[4][];
		ar[0] = new int[] { 10, 20, 30, 40 };
		ar[1] = new int[] { 10, 20 };
		ar[2] = new int[] { 10 };
		ar[3] = new int[] { 10, 20, 30, 40, 50 };
		ARTest05.Prn(ar);
		System.out.println();
		ARTest05.Prn02(ar);

	}
}
