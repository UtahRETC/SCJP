public class NullBadBoy {
	String name;
	NullBadBoy(String name) { this.name = name; }
	NullBadBoy() { name = "Generic"; }
	public String getName() {
		return name;
	}
	public static void main(String[] args) {
		try {
			new UhOh();
		} catch (NullPointerException npe) {
			System.out.println(npe);
		}
	}	
}

class UhOh {
	NullBadBoy nullBad;
	UhOh() { System.out.println(nullBad.getName()); }

}