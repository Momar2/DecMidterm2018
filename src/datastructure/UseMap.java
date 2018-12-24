package datastructure;

import java.util.*;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();


		hmap.put(22, "Dola");
		hmap.put(24, "Zaytuna");
		hmap.put(9, "Naziba");
		hmap.put(55, "Samuel");
		hmap.put(38, "Alice");


		String var = hmap.get(22);
		System.out.println("Index 22 has the value of: " + var);
		String var1 = hmap.get(9);
		System.out.println("Index 9 has the value of: " + var1);


		Map<String, List<String>> list = new HashMap<String, List<String>>();
		List<String> city = new ArrayList<String>();
		city.add("Tokyo");
		city.add("New York");
		city.add("Rio de Janeiro");
		list.put("City", city);
		System.out.println(list);

		List<String> country = new ArrayList<String>();
		country.add("Japan");
		country.add("USA");
		country.add("Brazil");
		list.put("Country ", country);
		System.out.println(list);

		for (Object str : list.keySet()) {
			System.out.println("KeySet:" + str);
			for (String str1 : list.get(str)) {
				System.out.println("Value: " + str1);
			}
		}

		Iterator itr = list.entrySet().iterator();
		System.out.println("List when using While Loop:");
		Iterator iterator = list.keySet().iterator();
		while (iterator.hasNext()) {
			Object values = iterator.next();
			for (String str1 : list.get(values)) {
				System.out.println("Value: " + str1);
			}
		}
	}

}
