package com.paniclater.serialize;
import java.io.*;

public class TestSave {
	public static void main(String[] args) {
		Parent parent = new Parent();
		//since the variables are declared within try/catch blocks they have scope limited to those blocks
		//you need to wrap the ObjectOutputStream and FileOutputStream construction in try catch -- you don't have to nest them like I did though.
		//Parent will succeed in saving, whereas child will not because it has a member that is marked neither transient nor serializable.
		//All code will compile, but an exception will be generated at runtime.
		//Remember when you see try / catch blocks that that is a pretty sure sign the exception or error will make it to runtime to play out.
		try {
			FileOutputStream fs = new FileOutputStream("Parent.ser");
			try {
				ObjectOutputStream os = new ObjectOutputStream(fs);
				os.writeObject(parent);
				os.close();
			} catch (IOException ioe) {
				System.out.println(ioe);
			}
		} catch (FileNotFoundException fnfe) {
			System.out.println(fnfe); 
		}
		Child child = new Child();
		try {
			FileOutputStream fs = new FileOutputStream("Child.ser");
			try {
				ObjectOutputStream os = new ObjectOutputStream(fs);
				os.writeObject(child);
				os.close();
			} catch (IOException ioe) {
				System.out.println(ioe);
			}
		} catch (FileNotFoundException fnfe) {
			System.out.println(fnfe);
		}
		
	}
}

class Parent implements Serializable {

}

class Child {
	Toy toy;
	Child() {
		toy = new Toy();
	}
}

class Toy {

}