import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       List l =new ArrayList();
       l.add(10);
       l.add(23);
       l.add(6);
       l.add(23);
       System.out.println("size:"+l.size());
       l.add(2, 200);
       //l.add("hello");
       l.add(12.12d);
       System.out.println("list contained:"+l);
       Iterator<Integer> it = l.iterator();
       while(it.hasNext())
       {
    	  Integer data= it.next();
    	   
    	   System.out.println(data);
       }
       System.out.println(l.get(2));
	}

}
