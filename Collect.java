package com.java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Collect {
 static	int parseInt;
	public static void main(String[] args) throws NumberFormatException {
LinkedList<String> list=new LinkedList<String>();
List <Integer> mylist1=new ArrayList<Integer>();

list.add("1");
list.add("13");
list.add("45");
list.add("23");
list.add("56");
list.add("24");
ListIterator<String> listIterator = list.listIterator();
while (listIterator.hasPrevious()) {
	System.out.println(listIterator.previous());
}







//for (String object : list) {
//	 parseInt= Integer.parseInt(object);
//	 mylist1.add(parseInt);
//	// System.out.println(mylist1);
//}
//System.out.println(mylist1);
//Collections.sort(mylist1);
//System.out.println(mylist1);
	}
	}
	


	


