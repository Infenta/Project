package com.lti.ui;
import com.lti.bean.*;
public class Demo1 {

	public static void main(String[] args) 
	{
		Employee emp=new Employee(100, "King", 24000.00); //Generating Super class object
		Manager m=new Manager(101,"Raja",50000.00, "IT");    //Generating Sub class object
		Engineer en=new Engineer(102,"Aamir Khan", 25000.00, "Swiggy");   //Generating Sub class object
		
		String empdata=emp.toString();
		System.out.println(empdata);
		
		String mgrdata=m.toString();       //manager is calling own class overrided method toString()
		 System.out.println(mgrdata);
		 
		 
		 String engdata=en.toString();     //Engineer is calling own class overrided method toString()
		 System.out.println(engdata);
	}

}
