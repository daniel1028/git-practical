public class Interest {
	public static void main(String args[]) {
		SBI s = new SBI();
		ICICI i = new ICICI();
		Axis a = new Axis();
		System.out.println("SBI Rate of Interest: " + s.getRateOfInterest());
		System.out.println("ICICI Rate of Interest: " + i.getRateOfInterest());
		System.out.println("AXIS Rate of Interest: " + a.getRateOfInterest());
	}
}
