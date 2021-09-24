package com;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Demo3 {

	public static void main(String[] args) throws Exception{
	FileInputStream fis = new FileInputStream("C:\\Users\\91990\\Desktop\\Java FIS\\Java_FIS_2021_Batch\\Java Programs\\Demo.java");
	FileOutputStream fos = new FileOutputStream("Demo.java");
	int ch;
	while((ch=fis.read()) != -1) {			// -1 is equal to EOF
			fos.write(ch);
	}
	fis.close();
	fos.close();
	System.out.println("File copied successfully");
	}

}
