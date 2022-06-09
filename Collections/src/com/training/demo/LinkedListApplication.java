package com.training.demo;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       /**
        * LL uses List and Deque interface 
        * internally use double LL to store data as data structure
        * Java LinkedList class can contain duplicate elements.
        * Java LinkedList class extends AbstractSequentialList class and implements List and Deque interfaces.
        * */
		
		LinkedList<String> al=new LinkedList<String>(); 
		 //boolean add(E e)
		  al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Ravi");  
		  al.add("Ajay");  
		  System.out.println(al);
		  
		//void add(int index, E element)
		 al.add(3, "Sibashish");
		 System.out.println(al);
		 
		//void addFirst(E e)
		 al.addFirst("Ashsih");
		 System.out.println(al);
		
		//void addLast(E e)
		 al.addLast("Swapna");
		 System.out.println(al);
		 
		 //E remove()
		 al.remove();
		 System.out.println("al.remove();"+al);
		 
		 //E remove(int index)
		 al.remove(2);
		 System.out.println("al.remove(2);"+al);
		 
		 
		 //E removeFirst()
		 al.removeFirst();
		 System.out.println("al.removeFirst();"+al);
		 
		 //boolean removeFirstOccurrence(Object o)
		 
		 LinkedList<String> al1=new LinkedList<String>(); 
		 //boolean add(E e)
		  al.add("Ravi");  
		 al.removeFirstOccurrence(al1);
		 System.out.println("al.removeFirstOccurance();"+al);
		 
		 //contains(E)
		 System.out.println(al.contains("Swapna"));
		 System.out.println(al.indexOf("Sibashish"));
		 System.out.println(al.lastIndexOf("Ajay"));
		 
		 //ITERATOR
		 System.out.println("......Iterator...");
		 Iterator<String> iterator= al.iterator();
		 while(iterator.hasNext()) {
			String b=(String) iterator.next();
			System.out.println(b);
		 }
		 
		 //forEach
		 System.out.println("......forEach...");
		 al.forEach((element) ->{
			 System.out.println(element);
		 });
		 
		 //for each adv
		 System.out.println("......for loop adv...");
		 for(String a: al) {
			 System.out.println(a);
		 }
		 
		
	}

}
