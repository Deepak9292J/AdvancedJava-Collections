package SetsInterface;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Iterator {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("Deepak");
		hs.add("Timsy");
		hs.add("rahul");
		hs.add("Test");	
		System.out.println(hs);
		
		Iterator<String> it = hs.iterator();
		/*String first = it.next();
		System.out.println(first);
		String second = it.next();
		System.out.println(second);*/
		while(it.hasNext())
		{
			String currentObj = it.next();
			System.out.println(currentObj);
		}
		
		
	}

}
