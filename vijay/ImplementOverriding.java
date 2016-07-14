//Implement method overriding
package applicationclass;

class Animal {

	public void move() {
		System.out.println("Animals can move");
	}
}

class Dog extends Animal {

	public void move() {
		System.out.println("Dogs can walk and run");
	}
}

public class ImplementOverriding {

	public static void main(String[] args) {

		Animal object = new Animal(); // Animal reference and object
		Animal object2 = new Dog(); // Animal reference but Dog object

		object.move();// runs the method in Animal class

		object2.move();// Runs the method in Dog class
	}

}
/*
 * output
 * 
 * Animals can move Dogs can walk and run
 */
