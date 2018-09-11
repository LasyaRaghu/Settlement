package com.pojo;

abstract public class Employee {
	private int empId;
	private String empname;
	private String com_name;
	public Employee()
	{
		System.out.println("Employee invoked");
		empId=10;
		empname="citi";
		com_name="CITI";
		
	}
	public Employee(int empId, String empname, String com_name)
	{
		this.com_name=com_name;
		this.empId=empId;
		this.empname=empname;
	}
	public void display()
	{
		System.out.println("name:-"+empname+"\tid:-"+empId+"\tcompany name:-"+com_name);
	}
	

}
