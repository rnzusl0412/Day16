package com.test01;

public class ARTest04 {
	// 문자열을 입력받은 View_Prn을 이용하여 소문자, 대문자 갯수를 출력한다.
	// 1. char[]로 리턴해서 char로 글자를 한자씩 탐색하여야 한다.
	// 2. 소문자 , 대문자일 경우 갯수를 구하는 cnt 변수를 선언해서 카운트한다.
	// 3. for문 안에서.

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
		System.out.println("str이 다음과 같을 때 : "+str);
		System.out.printf("대문자 갯수 : %d \n", a);
		System.out.printf("소문자 갯수 : %d \n", b);
	}

	public static void main(String[] args) {
		String str = "Converts this string to a new character array";
		View_Prn(str);

	}
}
