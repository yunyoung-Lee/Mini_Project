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
			System.out.print("[1] �Ź� ��� [2] �Ź� ��ȸ [3] �� �Ź� ��ȸ [4] ���� : ");
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
				System.out.println("�� �ֽ��ϴ�.");
				break;
			}
		}
		
		input.close();
	}
}
