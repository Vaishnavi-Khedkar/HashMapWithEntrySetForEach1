package com.test.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapWithEntry {
	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();
		map.put(1, "rani");
		map.put(5, "vaishnavi");
		map.put(2, "sonu");
		map.put(8, "teju");
		map.put(9, "gayu");
		map.put(7, "ram");

	//	Iterator<Entry<Integer, String>> iterator = map.entrySet().iterator();
//		while (iterator.hasNext()) {
//			Entry<Integer, String> next = iterator.next();
			
			
		Set<Entry<Integer, String>> set = map.entrySet();
		for(Entry<Integer, String> sv: set) {
			System.out.println(sv.getKey() + "\t" + sv.getValue());

		}

		System.out.println("******************");
		Iterator<Entry<Integer, String>> iterator1 = map.entrySet().iterator();
		while (iterator1.hasNext()) {
			Entry<Integer, String> next2 = iterator1.next();
			System.out.println(next2.getKey() + "\t" + next2.getValue());

			map.replace(5, "ashwini");
		}

	}
}