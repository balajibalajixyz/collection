package com.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class Collections_Class {

	public static void main(String[] args) {
int[] a= {1,3,3,4};
	List<Integer> list=new ArrayList<Integer>();
	for (Integer integer : a) {
		list.add(integer);
	}
	System.out.println(list);
	ListIterator<Integer> listIterator = list.listIterator();
	while (listIterator.hasNext()) {
		if (listIterator.next().equals(3)) {
			listIterator.set(2);
			System.out.println(listIterator);
		}
		
	}
	
	System.out.println(listIterator);
	
	}

}
