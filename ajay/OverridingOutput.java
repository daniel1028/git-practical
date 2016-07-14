class OverridingOutput extends Overriding {
	void run() {
		System.out.println("Bike is running safely");
	}

	public static void main(String args[]) {
		OverridingOutput obj = new OverridingOutput();
		obj.run();
	}
}
