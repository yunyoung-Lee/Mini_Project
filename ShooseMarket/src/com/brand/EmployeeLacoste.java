package com.brand;

import java.util.Scanner;

public class EmployeeLacoste implements Lacoste {
	String[] LacosteShoose={"[Biel]", "[Kanavi]", "[CourtMaster]"};
	int menu=0; 
	Scanner input=new Scanner(System.in);
	
	@Override
	public void getLacoste() {
		System.out.print("���ڽ��� �Ź��� ");
		for(String i:LacosteShoose)
			System.out.print(i+" ");
		System.out.println("�� �ֽ��ϴ�.");
	}

	@Override
	public String getProduct() {
		System.out.print("� ���� ��ðڽ��ϱ�? : ");
		menu=input.nextInt();
		
		return LacosteShoose[menu-1];
	}
}
