package com.java;

public class Reverse_String {
public static void main(String[] args) {
	String name="balaji";
	String rev="";
	for (int i = name.length()-1; i >=0 ;i--) {
		rev=rev+name.charAt(i);
	}
System.out.println(rev);
String replaceAll = rev.replaceAll("a", "");
System.out.println(replaceAll);
String name1="djbvaaaaalkdbvsdbjksbvcbjbaaaahhaaa";
String replaceAll2 = name1.replaceAll("a", "");
System.out.println(replaceAll2);
}
	
	
	
}
