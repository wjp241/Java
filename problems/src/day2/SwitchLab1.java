package day2;

public class SwitchLab1 {
/* 
 * 1. OperAndLab.java�� �����ؼ� SwitchLab1.java�� �����Ѵ�.
2. ���� ����� if ���� �ƴ� switch ������ �����Ͽ� �����Ѵ�.
   grade �� ���� 1 �Ǵ� 2 �Ǵ� 3�̸� ���� ����� ����Ѵ�.
   "x �г��� ���г��Դϴ�."
   grade �� ���� 4 �Ǵ� 5 �Ǵ� 6�̸� ���� ����� ����Ѵ�.
   "x �г��� ���г��Դϴ�."
 * */


	public static void main(String[] args) {
		double rand = Math.random();
		int grade = (int)(rand * 6) + 1;
		String lower = "�г��� ���г��Դϴ�";
		String higher = "�г��� ���г��Դϴ�";
		
		switch (grade) {
		  case 1:
		  case 2:
		  case 3:
			  System.out.println(grade + lower);
			  break;
		default:
			  System.out.println(grade + higher);
		
		}
	}
}
