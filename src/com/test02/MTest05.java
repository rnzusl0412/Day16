package com.test02;

import encore.playdata.platform03.Address;

public class MTest05 {
	public static void main(String[] args) {
		Address[] a1 = new Address[3];
		a1[0] = new Address("¼ÛÁø¿µ", "¼­¿ï", "010");
		a1[1] = new Address("±è±¹Çö", "¼ö¿ø", "4360");
		a1[2] = new Address("¿À½Â·æ", "¾È¾ç", "4941");

		for (Address r : a1) {
			if (r instanceof Address) {
				if (r.getName().equals("±è±¹Çö")) {
					r.setName("±¹Çö±è");
				}
			}
			System.out.println(r);
		}
	}
}
