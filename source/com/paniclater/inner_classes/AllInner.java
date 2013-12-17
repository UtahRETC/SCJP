
//ok this is a leeeeetle bit screwy, but all the inner classes are here ( I think );
public class AllInner {
	//first up, your regular vanilla inner class, nothing much to see here, move along, move along
	class regular {

	}
	void sayHello() {
		//now we have a method-local inner class.
		class methodLocal {
			//and inside our method-local class we have an anonymous inner class! 
			//Watch out for curly-braces after instantiation parentheses!
			ParentOfAnon parent = new ParentOfAnon() {

			};
			//they can even be trcky and be on the same line!
			//also remember to spot semicolons after curly braces for anonymous inner
			//it is one of the only times you need a semicolon after a curly every time.
			ParentOfAnon secondParent = new ParentOfAnon() {};
		}
		
	}
	// just a good ole method that takes an interface (obviously you can't instantiate an interface)
	// so what it actually takes is any class that implements the interface.
	void argAnon(ProudParent parent) {

	}
	public static void main(String[] arg) {
		//new instance of our class
		AllInner heyo = new AllInner();
		//ACK! we need to take an object that implements ProudParent, but we don't have one!
		//It kind of looks like an interface is being instantiated
		//But it is really an anonymous argument defined inner class -- the curly braces indicate
		//an anonymous class that is a child (i.e. implementer) of ProudParent! 
		//Anonymous instantiation of children elements on the fly ftw!
		heyo.argAnon(new ProudParent() {});
	}
		
}

interface ProudParent {}
class ParentOfAnon{}