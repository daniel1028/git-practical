
public class InterfaceResult implements MyInterface,ImplementInterface {
public void Display() {
	System.out.println("Welcome");
}
public void show() {
 System.out.println("BambeeQ");
		
	}
public static void main(String[] args) {
	InterfaceResult obj= new InterfaceResult();
	obj.Display();
	obj.show();
}
}
