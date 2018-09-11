package com.pojo;

public class Circle extends Shape {
private int radius;
public Circle() {
	super("circle");
}
public Circle(int radius, String name) {
	super(name);
	this.radius=radius;
}
@Override
public double area()
{
	return 3.14d*radius*radius;
}
}
