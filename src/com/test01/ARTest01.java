package com.test01;

public class ARTest01 {
	public static void Test01() {
		// 자료형[] 변수 = { , , , , };
		// 값의 개수로 인덱스를 할당받고 요소의 크기가 정해짐
		// 배열의 객체 .length가 인덱스보다 1이 크다.
		// ex) .length = 5 0~4 의 인덱스를 가진다.
		int ar[] = { 10, 20, 30, 40 };
		// ar[0], ar[1], ar[2], ar[3]
		System.out.println(ar + " : " + "요소의크기 : " + ar.length);
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);
		try {
			System.out.println(ar[4]);
		} catch (Exception e) {
			e.printStackTrace();
			e.getStackTrace();
		}
		System.out.println();
		for (int i = 0; i < ar.length; i++) {
			if (i == 0) {
				System.out.print(ar[i]);
			} else {
				System.out.printf("%3d", ar[i]);
			}

		}

	}

	public static void Test02() {
		// 자료형 변수[] = new 자료형[] { , , , , , } 동적할당
		int[] ar = new int[] { 10, 20, 30, 40 };
		ar[3] = 4000; // 값변경
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
	}

	public static void Test03() {
		// 자료형 변수[] = new 자료형[4]; 동적할당
		int[] ar = new int[4];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = (i + 5) * 13 - 5;
			System.out.println(ar[i]);
		}
	}

	public static void Test04() {
		int ar[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		for (int i = ar.length - 1; i >= 0; i--) {
			System.out.printf("%4d", ar[i]);
		}
	}

	public static void Test05() {
		int ar[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		for(int res: ar) {	//참조형만 가능하다.	 : 대등연산자.  인덱스만 순서대로 부른다.  변형X 
			System.out.printf("%5d",res);
			if (res == 40) {
				break;
			}
		}
	}

	public static void main(String[] args) {
		Test05();
	}
}
