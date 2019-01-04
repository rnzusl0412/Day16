package com.test02;

import encore.playdata.platform03.*;

public class MTest04 {
	public static void main(String[] args) {
		Address[] a1 = { new Address("¼ÛÁø¿µ", "¼­¿ï", "010"), new Address("±è±¹Çö", "¼ö¿ø", "4360"),
				new Address("¿À½Â·æ", "¾È¾ç", "4941") };
		
		for (Address r : a1) {
			if (r instanceof Address) {
				if (r.getName().equals("±è±¹Çö")) {
					r.setName("±¹Çö±è");
				}
			}
			System.out.println(r);
		}
		
		
		
		
//		for (int i = 0; i < a1.length; i++) {
//			System.out.println(a1[i]);
//		}
//		System.out.println("±è±¹ÇöÀ» ±¹Çö±èÀ¸·Î º¯°æ ÈÄ Ãâ·Â");
//		a1[0].setName("±¹Çö±è");
//		System.out.println(a1[0]);
	}
}
