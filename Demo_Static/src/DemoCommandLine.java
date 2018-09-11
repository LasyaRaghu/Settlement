
public class DemoCommandLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("arg:-"+args[0]+args[1]);
    int valu1 = Integer.parseInt(args[0]);
    int value2= Integer.parseInt(args[1]);
    System.out.println("you entered:"+(valu1+value2));
    Integer i =new Integer(100);
    i=300;//auto boxing
    int v=i; //auto unboxing
	}

}
