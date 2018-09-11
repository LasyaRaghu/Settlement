package mypack1.business;

public class Operation {
 
 public int add(int num1, int num2) {
	 return (num1+num2);
 }
 public int max(int[] arr)
 { 
	 int max=arr[0];
	 for(int i=1;i<arr.length;i++)
	 {
		 if(arr[i]>max)
			 max=arr[i];
	 }
	return max;
 }
}

