package com.bank.ui;
import com.bank.bean.*;
public class Demo1
	{

	public static void main(String[] args)
	{ 
		Customer c1=new Customer();
		/*c1.acceptValues(1,"ABC",9876543210L, 01234);*/
		String result = c1.display();
		System.out.println(result);
		
		Customer c2=new Customer(4,"DEF",5467439876L,2365);
		
		String result1 = c2.display();
		System.out.println(result1);
		
		 c1=null;
		 System.gc();
		 
		
	}

}
