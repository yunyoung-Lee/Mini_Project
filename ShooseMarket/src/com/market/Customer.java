package com.market;

import java.util.*;

public class Customer extends Shoose {
	Scanner input=new Scanner(System.in);
	int menu=0;
	
	public String Buy(String product) {
		System.out.println("������ ��ðڽ��ϱ�?");
		System.out.print("[1] �Ƶ�ٽ� [2] ����Ű [3] ���ڽ��� : ");
		menu=input.nextInt();
		
		switch(menu) {
		case 1:
			adidas.getAdidas();
			product=adidas.getProduct();
			break;
		case 2:
			nike.getNike();
			product=nike.getProduct();
			break;
		case 3:
			lacoste.getLacoste();
			product=lacoste.getProduct();
			break;
		}
		
		return product;
	}
}
