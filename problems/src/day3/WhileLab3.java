package day3;

//[ �ǽ�3 ]
//1. WhileLab3 �̶�� Ŭ������ �����Ѵ�.
//2. 0���� 30������ ������ �����Ѵ�.
//  ����� ���ڰ� 1�̸� 'A', 2 �̸� 'B', ... 26�̸� 'Z' �� ����ϴµ�
//  ��� ���� ����� ��������� �ݺ��ϴٰ� ������ 0�� ����ǰų�
//  27~30�� ����Ǹ� �ݺ��� ������.
//  �ݺ��ϴ� ���� ������� :  	B(2)
//  			A(1)
//			D(4)
//			  :
//  ���������� "����Ƚ���� x ���Դϴ�"�� ����ϰ� �����Ѵ�.
public class WhileLab3 {

	public static void main(String[] args) {
		Boolean shouldRun = true;
		
		int loopCount = 0;

		while(shouldRun) {
			
			loopCount ++;
			int rand = (int)(Math.random () * 31);
			
			if(rand == 0 ||(rand <= 30 && rand >= 27)) {
				
				shouldRun = false;
				
			} else {
				
				char  alph =(char)( '@'+ rand);

				
				System.out.print(alph + "(" + rand + ")" + "\n");
			}
				
		}
		
		System.out.print("����Ƚ���� " +  loopCount + "�� �Դϴ�");

	}

}
