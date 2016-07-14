class Vehicle {
	public void drive() {
		System.out.println("Driving a car");
	}
}

class Motor extends Vehicle {
	public void drive() {
		System.out.println("Driving a Bike");
	}

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		Motor obj = new Motor(); // this call show overriding
		obj.drive();
	}
}