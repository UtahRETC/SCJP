package com.paniclater.polymorphism;
import java.io.*;
public class MacPro extends Laptop {
	void crunch() throws FileNotFoundException { }
	public static void main(String[] args) throws IOException {
		new MacPro();
		new MacPro().crunch();
	}
}

abstract class Laptop {
	abstract void crunch() throws IOException;
}