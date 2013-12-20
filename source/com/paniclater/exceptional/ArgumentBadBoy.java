public class ArgumentBadBoy {
	public static void main(String[] args) {
		ArgumentBadBoy abb = new ArgumentBadBoy();
		int i = -1;
		try {
			abb.fail(i);
		} catch(IllegalArgumentException iae) {
			System.out.println(iae);				
		}
	}	
	void fail(int i) {
		if(i < 0) throw new IllegalArgumentException("i must be greater than 0!");	
	}
}

