package day4;

public class ArrayLab2 {
//	1. ArrayLab2 ��� Ŭ������ �ϳ� �����.
//	2. 10���� ����(����)�� ������ �� �ִ� �迭�� �ϳ� �����.
//	3. ������ ���ҿ�  4���� 20������ ������ �����Ͽ� �����Ѵ�.
//	4. ��� ������ ���� ���Ѵ�.
//	5. ������ ���� �������� ����Ѵ�.
//
//	    ��� ������ �� : x,x,x,x,x,x,x,x,x,x
//	    ��� ������ �� : x
	public static void main(String[] args) {
		
		int rand;
		int[] tenInts = new int[10];
		int sum = 0;
		String allIntsStr = "��� ������ ��: ";
		String intSumStr = "��� ������ ��: ";
		
		for(int i = 0; i < tenInts.length; i ++) {
			
			 rand = (int)(Math.random() * 17 + 4);
			tenInts[i] = rand;
			sum += rand;
			allIntsStr += rand + (i != tenInts.length - 1 ? ",":"");
			
		}
		
		System.out.print(allIntsStr + "\n" + intSumStr + sum);

	}

}
