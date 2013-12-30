package com.paniclater.args;

public class NoArgs {
	public static void main(String[] args) {
		//if you run this with java 1.4 or higher, enable assertions and give an int less than zero as the first arg you will get an assertion error
		//if you run this with java 1.4 or higher, enable assertions and pass no args you will get an ArrayIndexOutOfBoundsException(unchecked)
		//if you run this with java 1.4 or higher, enable assertions and pass a value that can't be parsed to an Integer you will get a NumberFormatException
		assert(Integer.parseInt(args[0]) > 0) : "You must have at least one arg and the first arg must be parseable to an Integer and greater than 0";
	}
}