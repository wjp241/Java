package day3;

public class ForLab7 {
//	[ �ǽ�2 ] ��� ���(��ø for)
//	1. ForLab5 ��� Ŭ������ �����Ѵ�.
//	2. STAR ��� ����� ����� '*'���� �ʱ�ȭ �Ѵ�.
//	3. ������ ���� ����� �ǵ��� �����Ѵ�.
//
//	    *******
//	    ******
//	    *****
//	    ****
//	    ***
//	    **
//	    *
	public static void main(String[] args) {
		final char STAR = '*';
		
		for(int i = 7; i >= 1; i-- ) {
			
			for(int j = i; j >= 1; j--) {
				System.out.print(STAR);
			}
			
			System.out.print("\n");
			
		}
		
		
	}

}
