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



		List<String> cityOfGreece = new ArrayList<>();
		cityOfGreece.add("Athens");
		cityOfGreece.add("Corinth");
		cityOfGreece.add("Oia");
		cityOfGreece.add("Veria");
		cityOfGreece.add("Mykonos");

		List<String> cityOfIndia = new ArrayList<>();
		cityOfIndia.add("Mumbai");
		cityOfIndia.add("Bengaluru");
		cityOfIndia.add("Pune");
		cityOfIndia.add("Jaipur");
		cityOfIndia.add("Surat");


		List<String> cityOfJapan = new ArrayList<>();
		cityOfJapan.add("Tokyo");
		cityOfJapan.add("Osaka");
		cityOfJapan.add("Kyoto");
		cityOfJapan.add("Hiroshima");
		cityOfJapan.add("Sapporo");


		Map<String, List<String>> list = new HashMap<>();
		list.put("GR",cityOfGreece);
		list.put("IN", cityOfIndia);
		list.put("JP",cityOfJapan);

		System.out.println(list);

		System.out.println(" ");
		System.out.println(" for each loop.....");
		for (Map.Entry<String, List<String>> st : list.entrySet()){
			System.out.println(st.getKey()+ " cities " +st.getValue());
		}



		System.out.println(" ");
		System.out.println(" iterator.....");
		Set set = list.entrySet();
		Iterator it = set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}

	}

}