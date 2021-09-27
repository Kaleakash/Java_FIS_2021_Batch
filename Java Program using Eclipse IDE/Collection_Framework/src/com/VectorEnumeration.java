package com;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEnumeration {
	public static void main(String[] args) {
		Vector vv =new Vector();
		vv.add(10);
		vv.add(20);
		vv.add(30);
		vv.add(40);
		Enumeration en = vv.elements();
		while(en.hasMoreElements()) {
			Object obj = en.nextElement();
			System.out.println(obj);
		}
	}
}
