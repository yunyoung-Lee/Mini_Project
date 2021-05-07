package com.brand;

import java.util.Scanner;

public class EmployeeNike implements Nike {
	String[] NikeShoose={"[Biel]", "[Kanavi]", "[CourtMaster]"};
	int menu=0;
	Scanner input=new Scanner(System.in);
	
	@Override
	public void getNike() {
		System.out.print("라코스테 신발은 ");
		for(String i:NikeShoose)
			System.out.print(i+" ");
		System.out.println("가 있습니다.");
	}

	@Override
	public String getProduct() {
		System.out.print("어떤 것을 사시겠습니까? : ");
		menu=input.nextInt();
		
		return NikeShoose[menu-1];
	}
}
