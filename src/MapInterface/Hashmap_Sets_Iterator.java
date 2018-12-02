package MapInterface;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Hashmap_Sets_Iterator {

	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1, "Deepak");
		hm.put(0, "Jindal");
		hm.put(2, "Ritu");	
		hm.put(3, "Batista");
		System.out.println(hm);
		Set se = hm.entrySet(); // Converting hashmap into the Set interface. So each Set enrty will have a combination of Key-Value
		Iterator it = se.iterator(); // Using iterator to traverse through each element in set
		while(it.hasNext())
		{
			Map.Entry mp = (Map.Entry)it.next(); // We are perform casting here. We are asking Set that, is Map kind of structure. So separate in form of key and value
			System.out.println(mp.getKey()); //Getting key
			System.out.println(mp.getValue()); // Getting respective value of the key. 
		}

	}

}
