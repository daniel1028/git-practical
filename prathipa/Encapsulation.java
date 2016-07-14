public class encap {

	public static void main(String args[]) {
		encap encap = new encap();
		encap.setName("Prathipa");
		encap.setAge(18);
		encap.setIdNum("12343ms");

		System.out.print("Name : " + encap.getName() + " Age : "
				+ encap.getAge());
	}

	private String name;
	private String idNum;
	private int age;

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public String getIdNum() {
		return idNum;
	}

	public void setAge(int newAge) {
		age = newAge;
	}

	public void setName(String newName) {
		name = newName;
	}

	public void setIdNum(String newId) {
		idNum = newId;
	}
}/*Name : Prathipa Age : 18*/
