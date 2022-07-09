package org.login;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Trail {

	public static void main(String[] args) {
		Map<Integer,String>m=new LinkedHashMap();
		m.put(10,"Jighiinu");
		m.put(20, "jikku");
		m.put(30,"shama");
		m.put(40,"Dheeshma");
		m.put(50,"jikku");
		m.put(20,"kathu");
		System.out.println(m);
		String string=m.get(40);
		System.out.println(string);
		Collection<String>values=m.values();
		System.out.println(values);
		Set<Integer>set=m.keySet();
		System.out.println(set);
		Set<Entry<Integer,String>>entrySet=m.entrySet();
		System.out.println(entrySet);
		for(Entry<Integer,String>entryset:m.entrySet());
		System.out.println();
	}
	
		
		
		
		
		

	}


