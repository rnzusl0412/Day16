package com.test01;

public class ARTest03 {

	public static char[] getChar_r(String str) {
		//char[]r= str.replace(" ","").toCharArray();
		str = str.replaceAll(" ", "");
		return str.toCharArray();
	}
	
	public static char[] getChar_r01(String str) {
		str = str.replace(" ", "");
		str = str.toUpperCase();		
		return str.toCharArray();
	}

	public static void main(String[] args) {
		// �־��� ���ڿ��� char[]�� ����� ����.
		// �� �־��� �޼ҵ带 Ȱ���ؼ� ������ �Ѵ�.
		// Converts this string to a new character array
		// 1. ���� ������ ���� ���Ϲ޴´�
		// 2. ���� ������ ���� �빮�ڷ� ���Ϲ���.
		
		String str = "Converts this string to a new character array";
		char[] res = getChar_r(str);
		for(char ch : res) {
			System.out.printf("%c, ",ch);
		}
		System.out.printf("\n\n");
		
		char[] res02 = getChar_r01(str);
		for(char ch : res02) {
			System.out.printf("%c, ",ch);
		}
		}
	}
