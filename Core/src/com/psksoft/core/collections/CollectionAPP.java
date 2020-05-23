package com.psksoft.core.collections;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.RandomAccess;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class CollectionAPP {

	public static void main(String[] args) {
		List<String> l= new ArrayList<String>();
		List<Integer> l2= Arrays.asList(2,3,4,5,6,7,42,43,68,9);
		l.add("satish");
		l.add("satish");
		l.add("sri");
		l.add("atish");
		l.add("sash");
		l.add("si");
		l.add("sish");
		l.add("sah");
		l.add("si");
		l.add("sth");
		l.add("ssh");
		l.add("saja");
		l.forEach(System.out::println);
		System.out.println("------------------");
		l2.forEach(System.out::println);
				//extends AbstractList<E>
		        //implements List<E>, RandomAccess, Cloneable, java.io.Serializable
				//Default initial capacity-10
		System.out.println(" List l contains siri-->"+l.contains("siri"));
		System.out.println("---->"+l.isEmpty()+"--->"+l.get(0)+"--->"+l.hashCode()+"--->"+l.size());
		List<String> filtered =l.stream().filter(s->s.length()>2).collect(Collectors.<String>toList());
		System.out.println("--------------------");
		System.out.println("filtered list"+filtered);
		Function<Integer, Integer> functionfunn=t -> t *2;
		System.out.println("function one argument and produces result"+functionfunn.apply(2));
		
		Consumer<List<String>> addList = p -> p.add("santhi");
		addList.accept(l);
		l.forEach(System.out::println);
		Random r = new Random();
		Supplier<Integer> sup= ()->r.nextInt(100);
		System.out.println("Random number->"+sup.get());
		
		ComparableClass cc = new ComparableClass(6474,"siri");
		System.out.println(cc.compareTo(cc));
	}

}
