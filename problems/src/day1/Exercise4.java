package day1;

/*�ǽ� 4(�������� �䱸�Ǵ� ������ܿ��� �߰��� �������� �ʴ´�.)

1. int Ÿ���� ���� number �� �����ϰ� 100 �̶�� ���� �����Ѵ�.
2. int Ÿ���� ���� result �� �����Ѵ�.

3. number ������ ���� 10�� ���ϰ� ����� result �� ��� 
   ����� ����Ѵ�.    ������� : ���� ������ ��� - 110

4. number ������ ���� 10�� ���� ����� result �� ��� 
   ����� ����Ѵ�.    ������� : ���� ������ ��� - 90

5. number ������ ���� 10�� ���ϰ� ����� result �� ��� 
   ����� ����Ѵ�.    ������� : ���� ������ ��� - 1000

6. number ������ ���� 10�� ������ ����� result �� ��� 
   ����� ����Ѵ�.	  ������� : ������ ������ ��� - 10

�ۼ� Ŭ������ : Exercise4
*/

public class Exercise4 {
	public static void main(String[] args) {
		int number = 100, result = number + 10;
		//String repeatStr = " ������ ��� - ";
		
		System.out.println("���� ������ ��� - " 
		//+ repeatStr 
				+ result);
		
		result = number - 10;
		System.out.println("���� ������ ��� - " 
				//+ repeatStr 
				+ result);

		result = number * 10;
		System.out.println("���� ������ ��� - " 
				//+ repeatStr 
				+ result);
		
		result = number / 10;
		System.out.println("������ ������ ��� - " 
				//+ repeatStr 
				+ result);

	}
}
