package com.test01;

public class ARTest01 {
	public static void Test01() {
		// �ڷ���[] ���� = { , , , , };
		// ���� ������ �ε����� �Ҵ�ް� ����� ũ�Ⱑ ������
		// �迭�� ��ü .length�� �ε������� 1�� ũ��.
		// ex) .length = 5 0~4 �� �ε����� ������.
		int ar[] = { 10, 20, 30, 40 };
		// ar[0], ar[1], ar[2], ar[3]
		System.out.println(ar + " : " + "�����ũ�� : " + ar.length);
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
		// �ڷ��� ����[] = new �ڷ���[] { , , , , , } �����Ҵ�
		int[] ar = new int[] { 10, 20, 30, 40 };
		ar[3] = 4000; // ������
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
	}

	public static void Test03() {
		// �ڷ��� ����[] = new �ڷ���[4]; �����Ҵ�
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
		for(int res: ar) {	//�������� �����ϴ�.	 : ������.  �ε����� ������� �θ���.  ����X 
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
