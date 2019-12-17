package interface2;
//+Sales()
//+Sales(name:String, number:int,
//        department:String, salary:int)
//+tax():double   // 세금
//+incentive(pay:int):void // 인센티브 지급
//+getExtraPay():double // 추가수당 지급

public class Sales extends Employee {
	public Sales(String name, int number, String department, int salary) {
		super(name, number, department, salary);
	}
//	세금을 리턴한다.
//	salary에 13% 징수

	
	public double tax() {
		return getSalary() * 0.13;
	}
//	salary에 계산된 인센티브를 가산한다. 인센티브는 pay의 120%이다.(pay가100이면 120을 가산)

	public void incentive(int pay) {
		setSalary(getSalary() + (int)(pay * 1.20));
	}
//	영업직원에게만 제공되는 추가수당을 리턴한다. salary의 3%금액 리턴

	public double getExtraPay() {
		return getSalary() * 0.03;
	}
}
