package com.test01;

public class ARTest04 {
	// ���ڿ��� �Է¹��� View_Prn�� �̿��Ͽ� �ҹ���, �빮�� ������ ����Ѵ�.
	// 1. char[]�� �����ؼ� char�� ���ڸ� ���ھ� Ž���Ͽ��� �Ѵ�.
	// 2. �ҹ��� , �빮���� ��� ������ ���ϴ� cnt ������ �����ؼ� ī��Ʈ�Ѵ�.
	// 3. for�� �ȿ���.

	public static void View_Prn(String str) {
		char[] ch = str.toCharArray();
		int a = 0;
		int b = 0;
		for (int i = 0; i < ch.length; i++) {
			if (Character.isUpperCase(ch[i])) {
				a++;
			} if (ch[i] >= 97 && ch[i] <= 124) {
				b++;
			}
		}
		System.out.println("str�� ������ ���� �� : "+str);
		System.out.printf("�빮�� ���� : %d \n", a);
		System.out.printf("�ҹ��� ���� : %d \n", b);
	}

	public static void main(String[] args) {
		String str = "Converts this string to a new character array";
		View_Prn(str);

	}
}
