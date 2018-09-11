import java.util.Scanner;

public class Demo1D {

	public static void main(String[] args) {
		int i;
		// TODO Auto-generated method stub
    int[] array;
    array = new int[4];
    Scanner sc =new Scanner(System.in);
    System.out.println("enter 4 integers to array");
    int[][] array1;
    array1 = new int[4][5];
    int length=array1[0].length;
    System.out.println(length);
    for(i=0;i<4;i++) {
    array[i]=sc.nextInt();
    }
    //array[0] =100;
    //array[1]=200;
    //array[2]=300;
    //array[3]=400;
   // array[4]=900;
    
    //System.out.println("2nd ele :-"+array[1]);
    for(i=0;i<array.length;i++)
    	System.out.println(array[i]);
    for(int var:array)
     System.out.println(var);
	}

}
