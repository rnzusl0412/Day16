package com.test01;

public class ARTest02 {

	public static void Prn(int[] r) {
		System.out.println("출력");
		for (int res : r) {
			System.out.printf("%5d", res);
		}
		System.out.println();
	}

	public static void Prnsum(int[] ar) {
		// ar[5] = ar[0]~ar[4] 의 합을 구한 후 전체 출력
		// ar[5]=ar[0]+ar[1]+ar[2]+ar[3]+ar[4];
		for (int i = 0; i < ar.length - 1; i++) {
			ar[5] += ar[i];
		}
		Prn(ar);
	}

	public static void main(String[] args) {
		//
		int[] ar = { 10, 20, 30, 40, 50, 0 };
		Prn(ar);
		Prnsum(ar);
		System.out.println("ar[5] = " + ar[5]);
	}
}
