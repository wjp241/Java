package day3;
//[ �ǽ�3 ] ��� ���(��ø for)
//1. ForLab6 ��� Ŭ������ �����Ѵ�.
//2. ������ ���� ����� �ǵ��� �����Ѵ�.
//
// A
//	BC
//	DEF
//	GHIJ
//	KLMNO
//	
public class ForLab8 {

	public static void main(String[] args) {
		
		char alph = 'A'; 

		for(int i = 1; i  <= 5; i ++) {
			
			
			for(int j = 1; j <= i; j++) {
				System.out.print(alph ++);
			}
			
			System.out.print( "\n");
		}
	}

}
