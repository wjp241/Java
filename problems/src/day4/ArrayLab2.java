package day4;

public class ArrayLab2 {
//	1. ArrayLab2 ��� Ŭ������ �ϳ� �����.

	public static void main(String[] args) {
		
		int rand;
		int[] tenInts = new int[10];
//		2. 10���� ����(����)�� ������ �� �ִ� �迭�� �ϳ� �����.

		int sum = 0;
		String allIntsStr = "��� ������ ��: ";
		String intSumStr = "��� ������ ��: ";
		
		for(int i = 0; i < tenInts.length; i ++) {
			
			 rand = (int)(Math.random() * 17 + 4);
//				3. ������ ���ҿ�  4���� 20������ ������ �����Ͽ� �����Ѵ�.
//				4. ��� ������ ���� ���Ѵ�.
//				5. ������ ���� �������� ����Ѵ�.
			//

			tenInts[i] = rand;
			sum += rand;
			allIntsStr += rand + (i != tenInts.length - 1 ? ",":"");
			
		}
//	    ��� ������ �� : x,x,x,x,x,x,x,x,x,x
//	    ��� ������ �� : x
		System.out.print(allIntsStr + "\n" + intSumStr + sum);

	}

}
