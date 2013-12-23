package com.paniclater.exceptional;

import java.text.*;
import java.util.*;


public class ParseBadBoy {
	public static void main(String[] args) {
		Locale germany = new Locale("German", "Germany");
		NumberFormat nf = NumberFormat.getInstance(germany);
		String s = "123.98";
		try {
			System.out.println(nf.parse(s));
		} catch (ParseException pe) {
			System.out.println(pe);
		}
		s = "goo";
		try { 
			System.out.println(nf.parse(s));
		} catch (ParseException pe) {
			System.out.println(pe);
		}
		s = "123.98goo";
		try { 
			System.out.println(nf.parse(s));
		} catch (ParseException pe) {
			System.out.println(pe);
		}
		
	}
}