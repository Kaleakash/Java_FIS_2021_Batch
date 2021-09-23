package com;

public class MyException extends Exception{
public MyException() {
	
}
public MyException(String msg) {
	super(msg);			// pass the message to Exception super class
}
}
