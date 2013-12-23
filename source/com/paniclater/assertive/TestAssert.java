package com.paniclater.assertive;

public class TestAssert {
	public static void main(String[] args) {
		new No().works();
		new Yes().works();
		new OhNo().works();
	}
}

class No {
	int x;
	No() {
		x = 2;
	}
	void works() {
		assert x == 1: "This Should Fail, x != 2, x == " + x;
	}
}

class Yes {
	int x;
	Yes() {
		x = 1;
	}
	void works() {
		assert x == 1: "This Should Succeed, x ==1";
	}	
}

class OhNo {
int x;
int assert = 5;
OhNo() {
	x = 2;
}
void works() {
	//assert(x == 2);
}
}