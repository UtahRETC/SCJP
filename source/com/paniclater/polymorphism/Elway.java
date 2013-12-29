import java.util.*;

public class Elway {
	public static void main(String[] args) {
		ArrayList[] ls = new ArrayList[3];
		//for(int i = 0; i < 3; i++) {
		//	ls[i] = new ArrayList();
		//	ls[i].add("a" + i);
		//}
		Object o = ls;
		do3(ls);
	}
	static Object do3(ArrayList[] a) {
		for(int i = 0; i < 3; i++) a[i].add("e");
		return a;
	}
}