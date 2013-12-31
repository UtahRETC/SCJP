package com.paniclater.collections;
import java.util.*;

class Dog implements Comparable{ 
	int size; 
	Dog(int s) { size = s; }
	public int getSize() {
		return size;
	}
	public int compareTo(Object o) {
		return ((Integer)size).compareTo(((Dog) o).getSize());
	}
}

public class FirstGrade2 {
	public static void main(String[] args) {
		TreeSet<Integer> i = new TreeSet<Integer>();
		TreeSet<Dog> d = new TreeSet<Dog>();
		d.add(new Dog(1)); d.add(new Dog(2)); d.add(new Dog(1));
		i.add(1); i.add(2); i.add(1);
		System.out.println(d.size() + " " + i.size());
	}
}