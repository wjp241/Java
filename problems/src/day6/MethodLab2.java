package day6;
//[ �ǽ� 2 ]
//1. Ŭ������ : MethodLab2
//
//2. �����ؾ� �ϴ� �߰� �޼��� (static �ٿ���)
//   �Ű����� : int Ÿ������ 2 ��
//   ���ϰ� : int Ÿ������ 1��
//   �޼���� : ���Ƿ�
//   ��� : ���޹��� 2���� ������ �߿��� ū ������ ���� ���� 
//            ���� ���� �� ���� �����ϸ� 0 �� �����Ѵ�.
//           10, 20 �� ���޵Ǹ� ---> 10 ����
//           20, 5 �� ���޵Ǹ� ---> 15 ����
//           5, 30 �� ���޵Ǹ� ---> 25 ����
//           6, 3 �� ���޵Ǹ�  ---> 3 ����
//
//3. main() �޼��忡���� 
//   1���� 30 ������ ���� 2 ���� �����Ͽ� 2������ ������ �޼��带 
//   ����� ������ ���� �������� ����Ѵ�.
//   "X �� Y �� ���� W �Դϴ�."
//   ----> 5 ȸ �ݺ�  ���ο��� �޼��� 5�� ȣ��

public class MethodLab2 {
	static int getDiff(int int1, int int2) {

		return  Math.abs(int1 - int2);
	}
	
	static int getRand() {
		return  (int)(Math.random() * 30 + 1);
	}
	public static void main(String[] args) {
		int int1 =0,  int2=0;
		int diff =0;
		for(int i = 0; i < 5; i ++) {
			int1 = getRand();
			int2 = getRand();
			diff =getDiff(int1, int2);
			System.out.printf("%d �� %d �� ���� %d �Դϴ�%n", int1, int2, diff);

		}
		
	}

}
