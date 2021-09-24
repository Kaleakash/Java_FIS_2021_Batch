package com;

import java.io.DataInputStream;
import java.io.FileOutputStream;

public class Demo2 {

	public static void main(String[] args) throws Exception{
		DataInputStream dis = new DataInputStream(System.in);
		FileOutputStream fos = new FileOutputStream("abc.txt");
		System.out.println("enter the data");
		int ch;
		while((ch=dis.read()) !=  '@' ) {
				fos.write(ch);
				System.out.print((char)ch);
		}
		fos.close();
	}
}
