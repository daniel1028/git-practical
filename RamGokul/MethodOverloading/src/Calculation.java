public class Calculation {
	void sum(int a, int b) {
		System.out.println("Sum of a+b:" + (a + b));
	}

	void sum(int a, int b, int c) {
		System.out.println("Sum of a+b+c:" + (a + b + c));

	}

	public static void main(String args[]) {
		Calculation obj = new Calculation();
		obj.sum(10, 10, 10);
		obj.sum(20, 20);

	}
}
