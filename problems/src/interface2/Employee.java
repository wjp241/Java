package interface2;
//+Employee()	기본 생성자
//+Employee(name:String, number:int,
//department:String, salary:int)	4개의 멤버 변수를 받는 생성자
//+tax():double	세금을 리턴한다.

abstract public class Employee {
//	- name:String
//	- number:int
//	- department:String // 부서
//	- salary:int // 월급
	
	private String name;
	private int number;
	private String department;
	private int salary;
	
	public Employee(String name, int number, String department, int salary) {
		this.name = name;
		this.number = number;
		this.department = department;
		this.salary = salary;
	}
	
	public double tax(){
		return 1.1;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}
