
public class DemoStatic {

	private int id;
	private String name;
	private static int counter;
	static
	{
		System.out.println("static block invoked");
		counter=0;
	}
	static
	{
		System.out.println("static block2 invoked");
		counter=0;
	}
	{
		System.out.println("non static block invoked");
	}
	public DemoStatic()
	{
		System.out.println("constructor invoked");
		id=10;
		name="citi";
		counter++;
	}
	public void display()
	{
		System.out.println("id :"+id +"\t name:"+name+"\t counter:"+counter);
	}
	public static void show() {
		System.out.println("counter"+counter);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoStatic d =new DemoStatic();
		DemoStatic d1 =new DemoStatic();
		DemoStatic d2 =new DemoStatic();
		DemoStatic d3 =new DemoStatic();
		DemoStatic d4 =new DemoStatic();
		DemoStatic d5 =new DemoStatic();
        d.display();
	}

}
