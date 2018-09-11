package com.pojo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;

public class Person implements Serializable{
public int perId;
public String personName;
transient public String personAddress;
public int personAge;
public Person(int perId, String personName, String personAddress, int personAge)
{
	this.perId=perId;
	this.personName=personName;
	this.personAddress=personAddress;
	this.personAge=personAge;
}
}

