package com.test02;

import encore.playdata.platform03.*;

public class MTest04 {
	public static void main(String[] args) {
		Address[] a1 = { new Address("������", "����", "010"), new Address("�豹��", "����", "4360"),
				new Address("���·�", "�Ⱦ�", "4941") };
		
		for (Address r : a1) {
			if (r instanceof Address) {
				if (r.getName().equals("�豹��")) {
					r.setName("������");
				}
			}
			System.out.println(r);
		}
		
		
		
		
//		for (int i = 0; i < a1.length; i++) {
//			System.out.println(a1[i]);
//		}
//		System.out.println("�豹���� ���������� ���� �� ���");
//		a1[0].setName("������");
//		System.out.println(a1[0]);
	}
}
