class A {
	void show() {
		System.out.println("Superclass method");
	}
}

class B extends A {
	void show(String t) {
		System.out.println(t);
	}
}

class Overloading {
	public static void main(String args[]) {
		// TODO Auto-generated method stub
		B subOb = new B();
		subOb.show("Subclass method");// this calls show() in A
		subOb.show();
	}
}