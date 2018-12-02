package ArrayList;

import java.util.ArrayList;

public class ArraylistDemo {

	public static void main(String[] args) {
		
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("Deepak");
		arr.add("Timsy");
		System.out.println(arr);
		arr.add(0, "Student");
		System.out.println(arr);
		/*arr.remove(1);
		System.out.println(arr);
		arr.remove("Timsy");
		System.out.println(arr);*/
		System.out.println(arr.get(1));
		System.out.println(arr.contains("test"));
		System.out.println(arr.indexOf("Timsy"));
			System.out.println(arr.size());

	}

}
