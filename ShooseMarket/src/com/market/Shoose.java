package com.market;

import com.brand.Adidas;
import com.brand.EmployeeAdidas;
import com.brand.EmployeeLacoste;
import com.brand.EmployeeNike;
import com.brand.Lacoste;
import com.brand.Nike;

public class Shoose {
	Adidas adidas=new EmployeeAdidas();
	Nike nike=new EmployeeNike();
	Lacoste lacoste=new EmployeeLacoste();
	
	public void getBrandShoose() {
		adidas.getAdidas();
		nike.getNike();
		lacoste.getLacoste();
	}
}
