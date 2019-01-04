package com.test02;
import com.test01.ARTest02;
import com.test01.ARTest05;

public class MTest01 {
	public static void main(String[] args) {
		// public static void arraycopy(Object src, int srcPos, Object dest, int
		// destPos, int length)
		int[] ar = { 10, 20, 30, 40, 50 };
		int[] br = { 3000, 4000, 5000 };
		int[] ar_copy = new int[5];
		int[][] k = new int[][] { { 11, 22, 33 }, { 44, 55, 66 } };

		System.out.println("ar");
		ARTest02.Prn(ar);

		System.out.println("ar_copy");
		
		System.arraycopy(ar, 0, ar_copy, 0, 2);
		System.arraycopy(br, 0, ar_copy, 2, br.length);
		ARTest02.Prn(ar_copy);

		int[][] ij = new int[2][3];
		
		System.arraycopy(k[0], 0,ij[0], 0, k[0].length);
		System.arraycopy(k[1], 0,ij[1], 0, k[0].length);
		ARTest05.Prn02(ij);
		}
}
