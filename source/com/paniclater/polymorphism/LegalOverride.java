package com.paniclater.polymorphism;
class Override {
	int add(int a , int b) throws IllegalArgumentException {
		return a + b;
	}
}
public class LegalOverride extends Override {
	//the rules for an override must be followed for a program to compile unless the parameter types / numbers change, in which case it is a legal overload not override
	
	//cannot have more restrictive access
	//private int add(int a, int b) { return a + b; } WILL NOT COMPILE
	
	//can have less restrictive access
	//public int add(int a, int b) { return a + b; } 
	//must maintain return type
	//Double add(int a, int b) { Double d = 10.0; return d; } WILL NOT COMPILE

	//cannot throw broader checked exceptions	
	//int add(int a, int b) throws Exception { return a + b; } WILL NOT COMPILE

	//cannot throw new checked exceptions
	//int add(int a, int b) throws InterruptedException { return a + b; } WILL NOT COMPILE

	//can throw narrower checked exceptions 
	int add(int a, int b) throws NumberFormatException {
		return a + b;
	}
	//if you change the parameter types then it is an overload not an override
	int add(String s) { return 5; }
	//if you change the paremeter numbers then it is an overload not an override
	int add(int a, int b, int c) { return a + b + c;  }
}