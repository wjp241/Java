package day3;
//[ �ǽ� 1 ] ��� ���(��ø for)
//1. ForLab4 ��� Ŭ������ �����.
//2. char Ÿ������ ������ �ϳ� ����� '&'�� �ʱ�ȭ �Ѵ�.
//3. 5���� 10������ ������ �ϳ� �����Ѵ�.
//4. ����� ���ڰ� 5��� �ݺ����� ����Ͽ� ������ ���� ����Ѵ�.
//
//	&
//	&&
//	&&&
//	&&&&
//	&&&&&
//    
//     ����� ���ڰ� 7�̶�� �ݺ����� ����Ͽ� ������ ���� ����Ѵ�.
//
//	&
//	&&
//	&&&
//	&&&&
//	&&&&&
//	&&&&&&
//	&&&&&&&
//
public class ForLab6 {
	public static void main(String[] args) {
		
		final char and = '&';
		int randNum = (int)(Math.random() * 6 ) + 5;
		
		for(int i = 1; i  <= randNum ; i++) {
			
			for(int j= 1; j <= i; j++) {
				
				if(j != i) {
					System.out.print(and);
				} else {
					System.out.println();
				}
			}
			
		}
		
//		String five = "&";
//		int randNum =(int)(Math.random() * 6) + 5;
//		
//		for(int i = 1; i <= randNum; i++) {
//			System.out.println(five);
//			five += "&";
//		}
		
				
		
	}
}
