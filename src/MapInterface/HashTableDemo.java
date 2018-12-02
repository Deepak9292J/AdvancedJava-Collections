package MapInterface;

import java.util.HashMap;
import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {
		Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
		ht.put(1, "Deepak");
		ht.put(0, "Jindal");
		ht.put(2, "Ritu");	
		ht.put(3, "Batista");
		System.out.println(ht);

	}

}
