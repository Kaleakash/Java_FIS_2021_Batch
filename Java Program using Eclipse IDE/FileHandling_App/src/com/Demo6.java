package com;

import java.io.FileReader;
import java.io.FileWriter;

public class Demo6 {

	public static void main(String[] args) throws Exception{
		FileReader fr = new FileReader("Demo.java");
		FileWriter fw = new FileWriter("C:\\Users\\91990\\Desktop\\Java FIS\\Demo.txt");
		int ch;
		while((ch = fr.read()) != -1) {
			fw.write(ch);
		}
		fr.close();
		fw.close();
		System.out.println("File stored...");
	}

}
