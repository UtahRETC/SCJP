public class EnumInit {
	public static void main(String[] args) {
		System.out.println(Color.RED.toString() + " Main");
		MyInit myInit = new MyInit();
		System.out.println(Color.BLUE.toString() + " Main");
		MyInit mySecondInit = new MyInit();
		
	}
}

enum Color {	
	RED, BLUE, GREEN;
 	String instanceVar = "Enum Instance Variable Text";
	String instanceVar2;
	static { System.out.println("Enum Static init block 1"); }
	{ System.out.println("Enum Instance init block 1"); }
	{ System.out.println(instanceVar + " Instance var in Instance init");} 
	{instanceVar2 = "HelloWorld";}
	{System.out.println(instanceVar2);}
	static { System.out.println("Enum Static static init block 2"); }
	Color() { 
		System.out.println(instanceVar);
		instanceVar2 = "Enum second instance var";
		System.out.println("Enum String Literal"); 
	}
	{ System.out.println("Enum Instance init block 2"); }	
}

class MyInit {
 	String instanceVar = "Class Instance Variable Text";
	static { System.out.println("Class Static init block 1"); }
	{ System.out.println("Class Instance init block 1"); }
	{ System.out.println(instanceVar + " Instance var in Instance init");}
	static { System.out.println("Class Static static init block 2"); }
	MyInit() { 
		System.out.println(instanceVar);
		System.out.println("Class String Literal"); 
	}
	{ System.out.println("Class Instance init block 2"); }	
}