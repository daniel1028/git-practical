public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		shape circleshape = new circle();

		circleshape.Draw();
	}
}

interface shape {
	public String baseclass = "shape";

	public void Draw();

}

class circle implements shape {

	public void Draw() {
		System.out.println("Drawing Circle here");
	}

} /*Drawing Circle here*/

