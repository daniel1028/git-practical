public class Encapsulation {
	private int empid;
	private String empName;
	private int empsalary;

	// Getter and Setter methods
	public int getEmpId() {
		return empid;
	}

	public String getEmpName() {
		return empName;
	}

	public int getEmpSalary() {
		return empsalary;
	}

	public void setEmpId(int newValue) {
		empid = newValue;
	}

	public void setEmpName(String newValue) {
		empName = newValue;
	}

	public void setEmpSalary(int newValue) {
		empsalary = newValue;
	}

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		Encapsulation obj = new Encapsulation();
		obj.setEmpId(100112);
		obj.setEmpName("Revathy");
		obj.setEmpSalary(25000);
		System.out.println("Employee Id: " + obj.getEmpId());
		System.out.println("Employee Name: " + obj.getEmpName());
		System.out.println("Employee Salary: " + obj.getEmpSalary());
	}
}/*Employee Id: 100112
Employee Name: Revathy
Employee Salary: 25000
*/
