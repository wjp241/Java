package interface2;
//+Sales()
//+Sales(name:String, number:int,
//        department:String, salary:int)
//+tax():double   // ����
//+incentive(pay:int):void // �μ�Ƽ�� ����
//+getExtraPay():double // �߰����� ����

public class Sales extends Employee {
	public Sales(String name, int number, String department, int salary) {
		super(name, number, department, salary);
	}
//	������ �����Ѵ�.
//	salary�� 13% ¡��

	
	public double tax() {
		return getSalary() * 0.13;
	}
//	salary�� ���� �μ�Ƽ�긦 �����Ѵ�. �μ�Ƽ��� pay�� 120%�̴�.(pay��100�̸� 120�� ����)

	public void incentive(int pay) {
		setSalary(getSalary() + (int)(pay * 1.20));
	}
//	�����������Ը� �����Ǵ� �߰������� �����Ѵ�. salary�� 3%�ݾ� ����

	public double getExtraPay() {
		return getSalary() * 0.03;
	}
}
