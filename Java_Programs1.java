package com.java;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Java_Programs1 {

	public static void main(String[] args) {
		//reverse number

		//		
		//		 int num=414859; while (num!=0) { System.out.print(num%10); num= num/10; }
		//		 
		//		
		//	//to check odd or even	
		//	int b=15;	
		//		if (b%2==0) {
		//			System.out.println("the number is even");
		//		}
		//		else {
		//			System.out.println("the number is odd");
		//		}

		// to check user input of odd or even
		//		System.out.println("Enter the number");
		//		Scanner sc=new Scanner(System.in);
		//		int nextInt = sc.nextInt();
		//		if (nextInt%2==0) {
		//			System.out.println("even");
		//		}
		//		else System.out.println("odd");

		// to check 1 to 50 which is odd and which is even
		//		for (int i = 1; i <=50; i++) {
		//			if (i%2==1) {
		//				System.out.println(i);
		//			}
		//			
		//		}
		// to check the 100 to 0 odd or even
		//		for (int i =100; i >=0; i--) {
		//			if (i%2==1) {
		//				System.out.println("odd is :"+i);
		//			}
		//		}

		// to check the whether array is equal is r not
		//		int a[]= {1,2,3,4,5,6};
		//		int[] b= {1,2,3,4,5,};
		//		boolean equals = Arrays.equals(a, b);
		//		if (equals==true) {
		//			System.out.println("arrays are equal");
		//		}
		//		else System.out.println("arrays are not equal");

		// to check the duplicate character from string
		//	String name="balaji";
		//	char[] charArray = name.toCharArray();
		//		for (int i = 0; i < charArray.length; i++) {
		//			for (int j = i+1; j < charArray.length; j++) {
		//				if (charArray[i]==charArray[j]) {
		//					System.out.println("the dublicate char is: "+charArray[j]);
		//				}
		//			}
		//		}
		// to check the duplicate element from string
		//		String []names= {"bal","bat","tea","cup","bat"};
		//		for (int i = 0; i < names.length; i++) {
		//			for (int j = i+1; j < names.length; j++) {
		//				if (names[i]==names[j]) {
		//					System.out.println("the duplicate String is: "+names[j]);
		////				}
		//			}
		//		}

		// String reverse and strored another String
		//	String nam="balaji";
		//	String rev="";
		//	for (int i = nam.length()-1; i >=0; i--) {
		//		rev=rev+ nam.charAt(i);
		//	}
		//	
		//	System.out.println(rev);
		//		//	
		//		int a=1641;
		//		int b=a;
		//int rev=0;
		//
		//while (a!=0) {
		//	rev=rev*10+a%10;
		//	a=a/10;
		//}
		//
		//if (b==rev) {
		//	System.out.println("palidrome");
		//}else {
		//	System.out.println("not a palidreome");
		//}

		//	int num=123;	
		//	int sum=0;	
		//		while (num!=0) {
		//			sum=sum+num%10;
		//			num=num/10;
		//		}
		//		System.out.println(sum);
		//		//int a= 123453;
		//		int rev=0;
		//		int sum=0;

		//			
		//		while (a!=0) {
		//		rev=rev*10+a%10;
		//		a=a/10;
		//		}
		////		System.out.println(rev);
		//		while (rev!=0) {
		//			sum=sum+rev%10;
		//			rev=rev/10;
		//		}	
		//	
		//	System.out.println(sum);
		
		
		// reverse String palindrome
//		
//		String name="malayalam";
//		String rev="";
//for (int i = name.length()-1; i >=0; i--) {
//	rev=rev+name.charAt(i);
//}
//System.out.println(rev);
//if (name.equals(rev)) {
//	System.out.println("palindrome");
//}else {
//	System.out.println("not a palindrome");
//} 
	int a=12321;
	int b=a;
	int sum=0;
	while (a!=0) {
		sum=sum*10+a%10;
		a=a/10;
	}
	System.out.println(sum);	
	if (b==sum) {
	System.out.println("palidrome");	
	}	else {
		System.out.println("not a palindrome");
	} 
	}
}



