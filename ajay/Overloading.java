public class Overloading {
	void sum(int a, int b) {
		System.out.println("Sum of a+b:" + (a + b));
	}

	void sum(int a, int b, int c) {
		System.out.println("Sum of a+b+c:" + (a + b + c));
	}

	public static void main(String args[]) {
		Overloading obj = new Overloading();
		obj.sum(5, 15, 40);
		obj.sum(70, 20);
	}
}