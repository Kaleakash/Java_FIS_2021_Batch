package com;


import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Demo4 {

	public static void main(String[] args) throws Exception{
	FileInputStream fis = new FileInputStream("C:\\Users\\91990\\Desktop\\Java FIS\\Java_FIS_2021_Batch\\Java Programs\\Demo.java");
	BufferedInputStream bis = new BufferedInputStream(fis);
	FileOutputStream fos = new FileOutputStream("Demo1.java");
	BufferedOutputStream bos = new BufferedOutputStream(fos);
	int ch;
	while((ch=bis.read()) != -1) {			// -1 is equal to EOF
			bos.write(ch);
	}
	bos.flush();			// send the data from buffer output to actual file 
	fis.close();
	fos.close();
	System.out.println("File copied successfully");
	}

}

