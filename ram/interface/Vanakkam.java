 public class Vanakkam implements Printable, Showable {

	public void print() {
		System.out.println("Hello");
	}

	public void show() {
		System.out.println("Welcome");
	}

	public static void main(String args[]) {
		Vanakkam obj = new Vanakkam();
		obj.print();
		obj.show();
	}

}
