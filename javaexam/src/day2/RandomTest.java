package day2;
public class RandomTest {
	public static void main(String[] args) {
		double rand1 = Math.random();
		System.out.println(rand1);
		double rand2 = rand1 * 100;
		System.out.println(rand2); // 0.0 <= n < 1.0
		int rand3 = (int)rand2;
		System.out.println(rand3); // 0 ~ 99
		
		// rand1 �� ������ 1���� 6������ ������ ����� ���� �����Ͽ�
		// sixNum ������ ��Ƽ� ����� ����
		System.out.println(rand1);
		System.out.println(rand1 * 6);

		System.out.println((int)(rand1 * 6));
		int sixNum = (int)(rand1 * 6)+1;
		System.out.println(sixNum); 		
//		// rand1 �� ������ 1���� 45������ ������ ����� ���� �����Ͽ�
//		// lottoNum ������ ��Ƽ� ����� ����
//		System.out.println(rand1);
//		int lottoNum = (int)(rand1 * 45)+1;
//		System.out.println(lottoNum); 	
//		
//		double hmm = 2.6;
//		int hmm2 = (int)hmm;
//		System.out.println(hmm2);
		
	}
}
