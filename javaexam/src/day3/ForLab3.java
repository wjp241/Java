package day3;

//1. ForLab3 �̶�� Ŭ������ �����.
//2. 1���� 10������ ������ �ϳ� �����Ѵ�.
//3. 30���� 40������ ������ �ϳ� �����Ѵ�.
//4. ù��° �������� �ι�° ���� ������ ���ڵ� �߿��� ¦���� ���� ����
//    ���� �������� ����Ѵ�.
//
//    X ���� Y ������ ¦���� �� : XX


public class ForLab3 {
	public static void main(String[]args) {
		
	
		int rand1 = (int)(Math.random() * 10) + 1;
		//range = (max - min) + 1;
		int rand2 = (int)(Math.random() * 11) + 30;
		int evenSum = 0;
		
		for(int i = rand1; i <= rand2; i+=1) {
			if(i%2 == 0) evenSum += i; 
		}
		
		System.out.println(rand1 + " ���� " + rand2 + " ������ ¦���� �� : " + evenSum);
	}
}
