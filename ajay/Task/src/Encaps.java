public class Encaps {
	public static void main(String args[]) {
		Encapsulation obj = new Encapsulation();
		obj.setEmpName("Ajay");
		obj.setEmpAge(18);
		obj.setId(112233);
		System.out.println("Employee Name: " + obj.getEmpName());
		System.out.println("Employee Id: " + obj.getId());
		System.out.println("Employee Age: " + obj.getEmpAge());
	}

}
