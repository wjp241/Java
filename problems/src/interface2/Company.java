package interface2;

public class Company {

	public static void main(String args[]) {
//    	name	number	department	salary
//    	Duke	1	secretary	800
//    	Tuxi	2	sales	1200

		// Employee 배열에 객체들을 생성하여 저장한다.

		Employee[] employees = { 
				new Secretary("Duke", 1, "Secretary", 800), 
				new Sales("Tuxi", 2, "Sales", 1200) 
				};
		// printEmployee() 메서드를 호출하여 Employee 배열의 객체들 정보를 출력한다.
		// 이 때는 세금을 출력하지 않는다.

		printEmployee(employees, false);
		// 모든 직원에게 인센티브로 100씩 지급한다.(직원에 따라 적용되는 인센티브 금액은
		// 다르다.
		((Secretary) (employees[0])).incentive(100);
		((Sales) (employees[1])).incentive(100);

		// printEmployee() 메서드를 호출하여 Employee 배열의 객체들 정보
		// 와 세금을 출력한다.
		printEmployee(employees, true);

	}

	public static void printEmployee(Employee[] emp, boolean isTax) {
		String extraPay;
		String toPrint;
		if (isTax) {
			
			toPrint = "name\tdepartment\tsalary\ttax\textra pay\n"
					+ "------------------------------------------------\n";
			for (Employee employee : emp) {

				extraPay = employee instanceof Sales ? String.format("%.1f", 
						((Sales) employee).getExtraPay()) : "";

				toPrint += String.format("%s\t%-10s\t%d\t%.1f\t%-10s\n", employee.getName(), employee.getDepartment(),
						employee.getSalary(), employee.tax(), extraPay);

			}

		} else {
			toPrint = "name\tdepartment\tsalary\textra pay\n" 
		+ "------------------------------------------------\n";
			for (Employee employee : emp) {

				extraPay = employee instanceof Sales ? String.format("%.1f", 
						((Sales) employee).getExtraPay()) : "";
				
				toPrint += String.format("%s\t%-10s\t%d\t%-10s\n", employee.getName(), employee.getDepartment(),
						employee.getSalary(), extraPay);

			}
		}
		
		System.out.print(toPrint);

	}
}
