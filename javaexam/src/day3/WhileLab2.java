package day3;



//1. WhileLab2 �̶�� Ŭ������ �����Ѵ�.
//2. ���� ����� �ݺ��ؼ� �����ϴ� ���α׷��� �����ϸ�
//    �ݺ������� while ���� ����Ѵ�.
//
//    1���� 6������ �ΰ� ������ �����Ͽ� ���� pairNum1, pairNum2 �� �����Ѵ�.
//
//    ����� �� ���� ���ڰ� ���� �ٸ��� ���� ũ�⸦ ���Ͽ� 
//    "pairNum1�� pairNum2 ���� ũ��." �Ǵ� "pairNum1�� pairNum2 ���� �۴�." 
//    ����Ѵ�.
//    
//    ����� �� ���� ���ڰ� �����ϸ� "���� ��"�̶�� �޽����� ����ϰ� �����Ѵ�.

public class WhileLab2 {
	
	public static void main(String[] args) {
		
		while(true) {
			int pairNum1 = (int)(Math.random() * 6) + 1;
			int pairNum2 =  (int)(Math.random() * 6) + 1;
			
			if(pairNum1 != pairNum2) {
				final String comment = pairNum1 > pairNum2 ? 
						(pairNum1 + " �� " + pairNum2 + "���� ũ��.") : (pairNum1 + " �� " + pairNum2 + "���� �۴�.");
				System.out.println(comment);
			} else {
				System.out.print("���� ��");
				break;
			}
			
		}
	

		
	}

}
