package day5;

public class arrayPrac3 {
//	������ 1�� 9������ �ߺ����� ���� ���ڷ� �̷���� 3�ڸ� ���ڸ� ������ ��
//	�α׷��̴�. (1)~(2)�� �˸��� �ڵ带 �־ ���α׷��� �ϼ��Ͻÿ�.
	public static void main(String[] args) {
		// ū �ݾ��� ������ �켱������ �Ž��� ����Ѵ�.
		int[] coinUnit = {500, 100, 50, 10};
		int money = 2680;
		int[] count = new int[4];
		
		System.out.println("money="+ money);
		
		for(int i=0;i<coinUnit.length;i++) {
			System.out.println(coinUnit[i]+ ": " + money / coinUnit[i] );
			money = money % coinUnit[i];
		}
		
		}
		
	}


