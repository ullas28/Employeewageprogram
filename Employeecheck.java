
public class Employeecheck {
	public static void main(String[] args) {
		int IS_PRESENT = 1;
		double employeeCheck = Math.floor(Math.random() * 10) % 2;
		if ( employeeCheck == 1)
			System.out.println("Employee is present");
		else
			System.out.println("Employee is absent");
	}
}
