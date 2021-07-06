package Inheritence;

public class inheritmain extends Employee1 {

	String location;
	static String company_name = "TCS";

	void currentemployee(String location, String company_name) {
		System.out.println("Associate EmployeeID	" + location);
		System.out.println("Associate Name 		" + company_name);

	}

	public static void main(String[] args) {
		// TODO Auo-generated method stub

		inheritmain emp = new inheritmain();
		emp.currentemployee("Chennai", company_name);
		emp.employee("Test Lead", "Automation Tester");
		emp.employee(251317, "Samson Edward");

	}

}
