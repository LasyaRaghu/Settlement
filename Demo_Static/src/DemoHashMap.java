import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;



public class DemoHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Integer> data = new HashMap<>();
		data.put("A", 100);
		data.put("X", 500);
		data.put("One",890);
		data.put("Y", 100);
		data.put("X", 99);

		System.out.println("size:"+data.size());
		System.out.println(data);
		Set<Entry<String, Integer>> entrySet= data.entrySet();
		Iterator<Entry<String, Integer>> iterator = entrySet.iterator();
		
		while(iterator.hasNext())
		{
			Entry<String, Integer>entry=iterator.next();
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
	}

}
