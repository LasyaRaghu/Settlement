package com.pojo;

public class Manager extends Employee {
    private double incentive;
    private String department;
    public Manager()
    {
    	System.out.println("Manager invoked");
    	incentive=12d;
    	department="admin";
    }
    public Manager(double incentive, String department)
    {
    	this.department=department;
    	this.incentive=incentive;
    }
    public String toString()
    {
    	
    	return("incentive:-"+incentive+"/tdepartment:-"+department);
    }
}
