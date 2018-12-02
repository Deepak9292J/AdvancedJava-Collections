package MapInterface;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1, "Deepak");
		hm.put(0, "Jindal");
		hm.put(2, "Ritu");
		System.out.println(hm);
		System.out.println(hm.get(2));
		hm.remove(2);
		System.out.println(hm);
		Set<Entry<Integer,String>> se = hm.entrySet();
		
		
		
		
		

	}

}
