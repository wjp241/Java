package day2;
/*
 * [ �ǽ� 3 ] if �� ��� �ǽ�
1. ConditionOperLab �̶�� Ŭ������ �����Ѵ�.
2. 1���� 5������ �������� �����Ѵ�.
3. ����� ���� 1�̸� 300 �� 50 �� ���� ������ ó���Ѵ�.
    ����� ���� 2�̸� 300 �� 50 �� ���� ������ ó���Ѵ�.
    ����� ���� 3�̸� 300 �� 50 �� ���� ������ ó���Ѵ�.
    ����� ���� 4�̸� 300 �� 50 �� ������ ������ ó���Ѵ�.
    ����� ���� 5�̸� 300 �� 50 �� ������ ������ ó���Ѵ�.
4. ��� ����(��, ����� ����ϴ� ���๮���� �� ���� �����Ѵ�.)
    ����� : XX
 */
public class ConditionOperLab {

	public static void main(String[] args) {
		double rand = Math.random();
		int toFiveRand = (int)(rand * 5) + 1;
		
		int result = 0;
		
		if(toFiveRand == 1) 
			result = 300 + 50;
		else if(toFiveRand == 2)
			result = 300 - 50;
		else if(toFiveRand == 3) 
			result = 300 * 50;
		else if(toFiveRand == 4) 
			result = 300 / 50;
		else 
			result = 300 % 50;
		
		System.out.println("����� : " + result);
		
		double doub = 0.9;
		System.out.println((int)(doub));
		
	}

}
