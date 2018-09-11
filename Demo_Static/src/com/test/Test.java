package com.test;

import mypack1.business.Operation;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operation o =new Operation();
        o.add(1, 2); 
        int arr[]= new int[5];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[4]=4;
        arr[3]=10;
        o.max(arr);
	}

}
