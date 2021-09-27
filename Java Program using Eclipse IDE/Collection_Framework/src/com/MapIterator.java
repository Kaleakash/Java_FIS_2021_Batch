package com;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapIterator {

	public static void main(String[] args) {
		Map mm= new HashMap();
		mm.put(1, "Raj");
		mm.put(2,"Rajesh");
		mm.put(3, "Lokesh");
		Set ss = mm.entrySet();			// converting map to set 
		Iterator ii = ss.iterator();
		while(ii.hasNext()) {
			//Object obj = ii.next();
			//System.out.println(obj);
			Map.Entry me = (Map.Entry)ii.next();
			System.out.println(me.getKey() +"   "+me.getValue());
		}
	}
}
