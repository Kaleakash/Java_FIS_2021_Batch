package com;

public class RethrowExceptionDemo {

	public static void main(String[] args) throws Exception{
		try {
			
		} catch (Exception e) {
			throw new Exception();
		}
	}

}
