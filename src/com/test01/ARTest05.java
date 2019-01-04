package com.test01;

public class ARTest05 {

	public static void Prn(int[][] res) {
		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res[i].length; j++) {
				System.out.printf("%5d", res[i][j]);
			}
			System.out.println();
		}
	}

	public static void Prn02(int[][] res) {
		for (int[] h : res) {
			for (int v : h) {
				System.out.printf("%5d", v);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[] ar[] = new int[][] { { 10, 20, 30 }, { 40, 50, 60 } };

		Prn02(ar);

	}
}
