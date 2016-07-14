

interface Printable {
	public int print();
}

interface Showable {
	public String print1();
}

class TestTnterface1 implements Printable, Showable {

	public int print() {
		System.out.println("Hello");
		return 12;
	}

	public String print1() {
		System.out.println("Hello");
		return "Hello";
	}

	public static void main(String args[]) {
		TestTnterface1 obj = new TestTnterface1();
		int val = obj.print();
		System.out.println("Value is : " + val);
	}
}