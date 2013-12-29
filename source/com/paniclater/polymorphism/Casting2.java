package com.paniclater.polymorphism;
import java.util.*;

public class Casting2 {
	public static void main(String[] args) {
		ArrayList[] ls = new ArrayList[3];
		Object o = ls;
		do3(ls);
	}
	static Object do3(ArrayList[] a) {
		for(int i = 0; i < 3; i++) a[i].add("e");
		return a;
	}
}