package com.lti.bean;

public class Engineer extends Employee
{
	private String project;
	public Engineer() {
		// TODO Auto-generated constructor stub
	}
	
	public Engineer(int eid,String ename, double salary, String project) 
	{
		super (eid,ename,salary);         //call to super class constructor
		this.project=project;
		                                    //using super keyword we can call super class variable or method or constructor
	}

	public String getProject() 
	{
		return project;
	}

	public void setProject(String project) 
	{
		this.project = project;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"Project is  "+project;
	}
}
