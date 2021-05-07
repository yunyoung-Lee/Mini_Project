package com.brand;

import java.util.*;

public class EmployeeAdidas implements Adidas {
	String[] AdidasShoose={"[SuperStar]", "[UltraBoost]", "[Gazel]"};
	int menu=0;
	Scanner input=new Scanner(System.in);
	
	@Override
	public void getAdidas() {
		System.out.print("아디다스 신발은 ");
		for(String i:AdidasShoose)
			System.out.print(i+" ");
		System.out.println("가 있습니다.");
	}

	@Override
	public String getProduct() {
		System.out.print("어떤 것을 사시겠습니까? : ");
		menu=input.nextInt();
		
		return AdidasShoose[menu-1];
	}
}
