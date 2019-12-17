package interface2;

public class Company {

	public static void main(String args[]) {
//    	name	number	department	salary
//    	Duke	1	secretary	800
//    	Tuxi	2	sales	1200

		// Employee �迭�� ��ü���� �����Ͽ� �����Ѵ�.

		Employee[] employees = { 
				new Secretary("Duke", 1, "Secretary", 800), 
				new Sales("Tuxi", 2, "Sales", 1200) 
				};
		// printEmployee() �޼��带 ȣ���Ͽ� Employee �迭�� ��ü�� ������ ����Ѵ�.
		// �� ���� ������ ������� �ʴ´�.

		printEmployee(employees, false);
		// ��� �������� �μ�Ƽ��� 100�� �����Ѵ�.(������ ���� ����Ǵ� �μ�Ƽ�� �ݾ���
		// �ٸ���.
		((Secretary) (employees[0])).incentive(100);
		((Sales) (employees[1])).incentive(100);

		// printEmployee() �޼��带 ȣ���Ͽ� Employee �迭�� ��ü�� ����
		// �� ������ ����Ѵ�.
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
