package com.acc.lkm.TreeMapDemo;
import java.util.*;
public class TreeMapDemo {

	public static void main(String[] args) {
	 //TreeMap<String,Integer>treeMap=new TreeMap<>();
	NavigableMap<String,Integer>treeMap=new TreeMap<>();
	 treeMap.put("John",97);
	 treeMap.put("Peter",100);
	 treeMap.put("Aryan", 81);
	 treeMap.put("Surya", 67);
	/* for(Map.Entry m1:treeMap.entrySet()) {
		 System.out.println(m1.getKey()+" "+m1.getValue());
	 }*/
	 System.out.println(treeMap);
	 System.out.println(treeMap.descendingMap());
	 System.out.println(treeMap.headMap("Peter",false));
	 System.out.println(treeMap.tailMap("John",true));
	 System.out.println(treeMap.subMap("Aryan",false,"Surya",true));
	 

	}

}
