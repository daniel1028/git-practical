

class CarClass {
	public int speedLimit(int a) {
		return 100 + a;
	}
}

public class Ford extends CarClass {
	public int speedLimit(int b) {
		return 150 + b;
	}

	public static void main(String args[]) {
		Ford obj = new Ford();
		int num = obj.speedLimit(23);
		System.out.println("Speed Limit is: " + num);
	}
}