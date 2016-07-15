//Implement method overloading concept
package taskprograms;

public class ImplementOverloding {
	void data(int a) {
		System.out.println("Values of data a : " + a);
	}

	void data(int a, int b) {
		System.out.println("values of data a and b: " + a + "," + b);
	}

	double data(double a) {
		System.out.println("double a: " + a);
		return a * a;
	}

	public static void main(String[] args) {
		ImplementOverloding Object = new ImplementOverloding();
		double result;
		Object.data(10);
		Object.data(10, 20);
		result = Object.data(5.5);
		System.out.println("Data output : " + result);

	}
}
/*
 * output
 * 
 * Values of data a : 10 values of data a and b: 10,20 double a: 5.5 Data output
 * : 30.25
 */
