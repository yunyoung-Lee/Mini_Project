package com.brand;

import java.util.Scanner;

public class EmployeeNike implements Nike {
	String[] NikeShoose={"[Biel]", "[Kanavi]", "[CourtMaster]"};
	int menu=0;
	Scanner input=new Scanner(System.in);
	
	@Override
	public void getNike() {
		System.out.print("���ڽ��� �Ź��� ");
		for(String i:NikeShoose)
			System.out.print(i+" ");
		System.out.println("�� �ֽ��ϴ�.");
	}

	@Override
	public String getProduct() {
		System.out.print("� ���� ��ðڽ��ϱ�? : ");
		menu=input.nextInt();
		
		return NikeShoose[menu-1];
	}
}
