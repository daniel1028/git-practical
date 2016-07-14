//Implementation of interface 
package applicationclass;

interface display {
	void print();
}

interface show {
	void print();
}

public class PrintName implements display, show { // to avoid ambiguity problem

	public void print() {
		System.out.println("Vijay");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintName object = new PrintName();
		object.print();
	}

}
/*
 * output
 * 
 * Vijay
 */