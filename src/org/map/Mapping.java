package org.map;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Mapping {
	public static void main(String[] args) {
		Map<Integer, String> m = new LinkedHashMap<>();

		m.put(10, "CHURCHIL");
		m.put(20, "JESURAJ");
		m.put(30, "VINCY");
		m.put(40, "JAISI");
		m.put(50, "RAJAKUMAR");
		m.put(20, "TAMILARASI");


		int size = m.size();
		System.out.println(size);
		

		String string = m.get(40);
		System.out.println(string);

		String remove = m.remove(10);
		System.out.println(remove);

		boolean containsKey = m.containsKey(10);
		System.out.println(containsKey);

		boolean containsValue = m.containsValue("TAMILARASI");
		System.out.println(containsValue);

		Collection<String> values = m.values();
		System.out.println(values);

		Set<Integer> keySet = m.keySet();
		System.out.println(keySet);

		Set<Entry<Integer, String>> entrySet = m.entrySet();
		System.out.println(entrySet);

		for (Entry<Integer, String> a : entrySet) {
			System.out.println(a);

		}
		for (Entry<Integer, String> a : entrySet) {
			System.out.println(a.getKey());
		}
		for (Entry<Integer, String> a : entrySet) {
			System.out.println(a.getValue());
			
		}

	}

}
