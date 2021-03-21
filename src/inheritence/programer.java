package inheritence;

public class programer extends Employee {
	int bonus = 10000;
	public static void main(String args[]) {
		programer p = new programer();
	System.out.println("salary of programer is "+p.bonus);
	System.out.println("salary of empolyee is " + p.salary);
	}
	
}
