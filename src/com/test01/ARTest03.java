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
		// 주어진 문자열을 char[]로 출력을 하자.
		// 단 주어진 메소드를 활용해서 구현을 한다.
		// Converts this string to a new character array
		// 1. 공백 제거한 값을 리턴받는다
		// 2. 공백 제거한 겂을 대문자로 리턴받자.
		
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
