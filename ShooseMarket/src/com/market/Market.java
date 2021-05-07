package com.market;

import java.util.*;

public class Market {
	public static void main(String[] args) {
		int menu=0;
		Scanner input=new Scanner(System.in);
		Customer customer=new Customer();
		String product=null;
		ArrayList<String> Shoose=new ArrayList<String>();
		
		while(menu!=4) {
			System.out.print("[1] 신발 사기 [2] 신발 조회 [3] 내 신발 조회 [4] 종료 : ");
			menu=input.nextInt();
			switch(menu) {
			case 1:
				Shoose.add(customer.Buy(product));
				break;
			case 2:
				customer.getBrandShoose();
				break;
			case 3:
				for(String List:Shoose)
					System.out.print(List+" ");
				System.out.println("가 있습니다.");
				break;
			}
		}
		
		input.close();
	}
}
