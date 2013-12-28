package com.paniclater.polymorphism;

public class StaticMethods {
	public static void main(String[] args) {
		Parent parent = new Parent();
		parent.sayHello();
		parent.sayH();
		parent = new Child();
		//object type determines which non-static method will be invoked, as you would expect
		parent.sayHello();
		//it is impossible to override static methods they can only be redefined
		//because of this reference variable NOT object type determines which static method will be invoked.
		parent.sayH();
		
		Child child = new Child();
		child.sayHello();
		child.sayH();
	}
}

class Parent {
	void sayHello() {
		System.out.println("Parent");
	}
	static void sayH() {
		System.out.println("Parent");
	}
}

class Child extends Parent {
	void sayHello() {
		System.out.println("Child");
	}
	static void sayH() {
		System.out.println("Child");
	}
}