package com.main;

import com.bean.EmployeeBean;
import com.utility.Utility;

public class Application {

	public static void main(String[] args) {

		EmployeeBean eb = new EmployeeBean();
		eb.setName("Mohammed Shafiq Fata");
		eb.setAge(40);

		Utility u = new Utility(eb);

		System.out.println("saved to database : " + u);
	}

}
