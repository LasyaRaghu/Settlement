package com.impl;

public interface MathOperation {
int add(int x, int y);
double div(int x, int y);
default double area(int radius)
{
	return 100;
}
default String greeting()
{
	return "hello";
}
}
