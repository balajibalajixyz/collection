package com.java;

public class Exception_Java {

	public static void main(String[] args) {
int a=10;
int b=20;
int c ;
String name=null;

try {
	int length = name.length();
	System.out.println(length);
	try {
		c = a/0;
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
} catch (NullPointerException e ) {
	System.err.println("name is null we check the length ");
}
catch (ArithmeticException e) {
	System.out.println(e);
}
System.out.println("impotant line");
System.out.println("impotant line");
System.out.println("impotant line");
System.out.println("impotant line");
	}

}
