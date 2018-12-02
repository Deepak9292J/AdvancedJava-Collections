package SetsInterface;

import java.util.HashSet;

public class hashSet {

	public static void main(String[] args) {

		HashSet<String> hs = new HashSet<String>();
		hs.add("Deepak");
		hs.add("Timsy");
		System.out.println(hs);
		hs.add("Student");
		System.out.println(hs);
		hs.remove("Deepak");
		System.out.println(hs);
		System.out.println(hs.isEmpty());
		System.out.println(hs.contains("Timsy"));
		System.out.println(hs.size());
	}

}
