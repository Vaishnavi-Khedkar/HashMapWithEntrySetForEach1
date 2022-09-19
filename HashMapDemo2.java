package com.test.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo2 {
	
	public static void main(String[] args) {
	   Map<Integer,String> map=new HashMap<>();
	   map.put(10, "vaishu");
	   map.put(23, "rani");
	   map.put(22, "sonu");
	   map.put(4, "gayu");
	   map.put(2, "teju");
	   map.put(1, "shruti");
	   
	   Set<Integer> set = map.keySet();
	   Iterator<Integer> ite= set.iterator();
	   while(ite.hasNext()) {
		   int a = ite.next();
		   
		   //System.out.println(a);
		   System.out.println(+a+"\t"+map.get(a));
	   }
	}
}