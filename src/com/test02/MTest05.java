package com.test02;

import encore.playdata.platform03.Address;

public class MTest05 {
	public static void main(String[] args) {
		Address[] a1 = new Address[3];
		a1[0] = new Address("������", "����", "010");
		a1[1] = new Address("�豹��", "����", "4360");
		a1[2] = new Address("���·�", "�Ⱦ�", "4941");

		for (Address r : a1) {
			if (r instanceof Address) {
				if (r.getName().equals("�豹��")) {
					r.setName("������");
				}
			}
			System.out.println(r);
		}
	}
}
