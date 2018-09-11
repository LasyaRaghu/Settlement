import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class DemoHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Set<String> names = new TreeSet<>();
     names.add("java");
     names.add(".NET");
     names.add("Testing");
     names.add("Spring");
     names.add("Testing");
     System.out.println("size:"+names.size());
     System.out.println(names);
     boolean removed = names.remove(".NeT");
     if(removed)
     {
    	 System.out.println("data rlly");
    	 
     }
     else
     {
    	 System.out.println("no data found");
     }
     System.out.println("after removal:-"+names);
	}

}
