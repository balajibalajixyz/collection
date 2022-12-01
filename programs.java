package com.java;

public class programs {
	public static void main(String[] args) {
		String name="bala123";
		String replace = name.replace("bala", "");
		System.out.println(replace);
		int parseInt = Integer.parseInt(replace);
		System.out.println(parseInt+"********");
		String string = Integer.toString(parseInt);
		System.out.println(string+"$$$$");
		if (string.equals("1234")) {
			System.out.println("equal");
		}else {
			System.out.println("Not equal" );
		}


		String name2="pradeep";
		
		String word="";
		//	StringBuffer str=new StringBuffer(name2);
		//	StringBuffer reverse = str.reverse();
		//	System.out.println(reverse);

		for (int i = name2.length()-1; i >=0; i--) {
		char charAt = name2.charAt(i);
word=word+charAt;

		}
		System.out.println(word);

	
	
	if (name2.equals("pradeep")) {
		System.out.println("palidrome");
	}
	else {
		System.out.println("not a palindrome");
	}
	String wel="welcome";
	int length = wel.length();
	System.out.println(length);
	boolean contains = wel.contains("w");
	System.out.println(contains);
	int indexOf = wel.indexOf(0);
	String substring = wel.trim();
	System.out.println(substring);
	}
	}
