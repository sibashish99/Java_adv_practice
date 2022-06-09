package com.training.demo;

import java.util.HashSet;
import java.util.Set;

public class HashSetApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /**
         * HashSet contains unique elements only.
         * HashSet allows null value.
         * HashSet is the best approach for search operations.
         * It internally use HashMap to store data
         * It inherits the AbstractSet class and implements Set interface.
         * HashSet => AbstractSet -> Set => Collection => Iterable  (-> implements, => extends)
         * A list can contain duplicate elements whereas Set contains unique elements only.
         * Java HashSet class is used to create a collection that uses a hash table for storage. 
         * 
         * */
		duplicateValue();
		nullValueDemo();
		orderValueDemo();
		
	}
	public static void duplicateValue() {
		Set<String> setVal= new HashSet<String>();
		setVal.add("Sibashish");
		setVal.add("Sibashish");
		setVal.add("Sibashish1");
		setVal.add("Sibashish1");
		setVal.add("Sibashish2");
		setVal.add("Sibashish");
		
		
		System.out.println(setVal);
		
	}
	public static void nullValueDemo() {
		Set<String> setVal= new HashSet<String>();
		setVal.add("Sibashish34");
		setVal.add(null);
		setVal.add(null);
		setVal.add("Sibashish10");
		setVal.add("Sibashish2");
		setVal.add(null);
		
		System.out.println(setVal);
		
	}
	public static void orderValueDemo() {
		Set<String> setVal= new HashSet<String>();
		setVal.add("Sibashish34");
		setVal.add("abc123");
		setVal.add(null);
		setVal.add("Sibashish10");
		setVal.add("Sibashish2");
		setVal.add("Valnull");
		
		System.out.println(setVal);
		
	}

}
