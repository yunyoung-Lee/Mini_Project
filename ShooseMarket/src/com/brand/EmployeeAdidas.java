package com.brand;

import java.util.*;

public class EmployeeAdidas implements Adidas {
	String[] AdidasShoose={"[SuperStar]", "[UltraBoost]", "[Gazel]"};
	int menu=0;
	Scanner input=new Scanner(System.in);
	
	@Override
	public void getAdidas() {
		System.out.print("�Ƶ�ٽ� �Ź��� ");
		for(String i:AdidasShoose)
			System.out.print(i+" ");
		System.out.println("�� �ֽ��ϴ�.");
	}

	@Override
	public String getProduct() {
		System.out.print("� ���� ��ðڽ��ϱ�? : ");
		menu=input.nextInt();
		
		return AdidasShoose[menu-1];
	}
}
