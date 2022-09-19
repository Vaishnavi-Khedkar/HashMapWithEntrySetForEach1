package com.test.map;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapWithEntrySetForEach {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> m=new HashMap<>();
		m.put(78, "rani");
		m.put(6, "vaishu");
		m.put(2, "appu");
		m.put(100, "teju");
		m.put(90, "gayuu");
		
		Set<Entry<Integer, String>> entrySet = m.entrySet();
		
		for(Entry<Integer, String> entry1 :entrySet) {
			System.out.println(entry1.getKey()+"\t"+entry1.getValue());
		}
		
		
		System.out.println("*******************");
		
		m.replace(78, "Ashwini");
		
		for(Entry<Integer, String> entry2 :entrySet) {
			System.out.println(entry2.getKey()+"\t"+entry2.getValue());
		}
	}
}