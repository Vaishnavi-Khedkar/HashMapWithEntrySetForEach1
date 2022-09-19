package com.test.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {
	
	public static void main(String[] args) {
		
		Map<Integer, String> map=new HashMap<>();
		map.put(1, "rani");
		map.put(5, "vaishu");
		map.put(2, "sonu");
		map.put(8, "teju");
		map.put(9, "gayu");
		map.put(7, "ram");
		
		Set<Integer> set = map.keySet();
		Iterator<Integer> iter = set.iterator();
		while(iter.hasNext()) {
			Integer next = iter.next();
			
			System.out.println(next+"\t"+map.get(next));
		//System.out.println();
			String replace = map.replace(5,"asshu");
			
			//System.out.println(replace+"\t"+map.get(replace));
			Set<Entry<Integer, String>> entrySet1 = map.entrySet();
			for(Entry<Integer, String> entry2 :entrySet1  ) {
			System.out.println(entry2.getKey()+"\t"+entry2.getValue());
			}
		}
	}
}
