package interface2;
//+Secretary()
//+Secretary(name:String, number:int,
//             department:String, salary:int)
//+tax():double   // ����
//+incentive(pay:int):void  // �μ�Ƽ�� ����

public class Secretary extends Employee {
	public Secretary(String name, int number, String department, int salary) {
		super(name, number, department, salary);
	}
//	������ �����Ѵ�.
//	salary�� 10% ¡��


	public double tax() {
		return getSalary() * 0.10;
	}
//	salary�� ���� �μ�Ƽ�긦 �����Ѵ�. �μ�Ƽ��� pay�� 80%�̴�.
//	(pay��100�̸� 80�� ����)
	public void incentive(int pay) {
		setSalary(getSalary() + (int)(pay * 0.80) );
	}
}
