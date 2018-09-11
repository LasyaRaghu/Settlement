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
       System.out.println("list contained:"+l);
       Iterator it = l.iterator();
       while(it.hasNext())
       {
    	   Object o=it.next();
    	   Integer i=(Integer)o;
    	   System.out.println(i.intValue());
       }
	}

}
