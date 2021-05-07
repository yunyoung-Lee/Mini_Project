package com.brand;

import java.util.Scanner;

public class EmployeeLacoste implements Lacoste {
	String[] LacosteShoose={"[Biel]", "[Kanavi]", "[CourtMaster]"};
	int menu=0; 
	Scanner input=new Scanner(System.in);
	
	@Override
	public void getLacoste() {
		System.out.print("라코스테 신발은 ");
		for(String i:LacosteShoose)
			System.out.print(i+" ");
		System.out.println("가 있습니다.");
	}

	@Override
	public String getProduct() {
		System.out.print("어떤 것을 사시겠습니까? : ");
		menu=input.nextInt();
		
		return LacosteShoose[menu-1];
	}
}
