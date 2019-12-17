package interface2;
//+Secretary()
//+Secretary(name:String, number:int,
//             department:String, salary:int)
//+tax():double   // 세금
//+incentive(pay:int):void  // 인센티브 지급

public class Secretary extends Employee {
	public Secretary(String name, int number, String department, int salary) {
		super(name, number, department, salary);
	}
//	세금을 리턴한다.
//	salary에 10% 징수


	public double tax() {
		return getSalary() * 0.10;
	}
//	salary에 계산된 인센티브를 가산한다. 인센티브는 pay의 80%이다.
//	(pay가100이면 80을 가산)
	public void incentive(int pay) {
		setSalary(getSalary() + (int)(pay * 0.80) );
	}
}
