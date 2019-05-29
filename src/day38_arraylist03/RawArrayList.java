package day38_arraylist03;

import java.util.ArrayList;

public class RawArrayList {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("Saturday");
		list.add("Java Day");
		list.add(1000);
		list.add(234.4);
		list.add(true);
		list.add(false);
		
		System.out.println(list);// automatically call toString()
		String allValues = list.toString();
		System.out.println(allValues);
		
		String str = list.get(0).toString();
		System.out.println(str);
		Integer i = (Integer)list.get(2);
		System.out.println(i);
		Double d = (Double)list.get(3);
		System.out.println(d);
		//All values are stored as raw type. We can also call it, as a General Object type
		
	}
}
