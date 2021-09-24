package com;

import java.io.File;

public class Demo7 {

	public static void main(String[] args) throws Exception{
	File ff = new File("C:\\Users\\91990\\Desktop\\Java FIS\\Demo.txt");
	System.out.println(ff.getAbsolutePath());
	System.out.println(ff.isDirectory());
	System.out.println(ff.isFile());
	System.out.println(ff.canRead());
	System.out.println(ff.canWrite());
	}

}
