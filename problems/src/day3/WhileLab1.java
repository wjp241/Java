package day3;

//[ �ǽ�1 ]
//		1. WhileLab1 �̶�� Ŭ������ �����Ѵ�.
//		2. 5���� 10������ ������ �����Ѵ�.
//		3. 1���� ����� ���ڰ������� �� ���ڵ��� �������� ������� ����Ѵ�.
//		   (�ϳ��� Ŭ�����ȿ� for �� while �� ���� �����Ѵ�.)
//		   ===>  7�� ����Ǹ�
//		    [ for ��� ]
//		     1 -> 1
//		     2 -> 4
//		     3 -> 9
//		     4 -> 16
//		     5 -> 25
//		     6 -> 36
//		     7 -> 49
//		    [ while ��� ]
//		     1 -> 1
//		     2 -> 4
//		     3 -> 9
//		     4 -> 16
//		     5 -> 25
//		     6 -> 36
//		     7 -> 49

public class WhileLab1 {
//	
	public static void main(String[] args) {
		int rand = (int)(Math.random() * 6) + 5;
		
		for(int i = 1; i <= rand; i ++) {
			System.out.print(i + "->" + (i * i) + "\n");
		}
		
		int i = 1;
		while(i <= rand) {
			System.out.print(i + "->" + (i * i) + "\n");
			i ++;
		}
	}
}
