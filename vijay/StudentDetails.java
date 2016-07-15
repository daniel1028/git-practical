//Implement Encapsulation  concept
package applicationclass;

public class StudentDetails {
	private String name;
	private int age;

// Define all setter and getter methods for each member field to access private variables.
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void result() {

		System.out.println("name :" + name + " " + "age : " + age);
	}

}

	