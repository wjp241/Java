package day4;
//[ �ǽ� 4 ]
//1. ArrayLab4 �̶�� Ŭ������ �ϳ� �����.
//2. 10 ���� ���Ҹ� ���� int Ÿ���� �迭�� ������ �Ŀ� �� �迭�� 
//   ������ ���Ұ����� 1���� 26 ������ ������ �����Ͽ� �����Ѵ�.
//3. 10���� ���Ҹ� ���� char Ÿ���� �迭�� �����Ѵ�.
//4. 2������ ������ �迭�� ������ ���Ұ��� 3������ ������ �迭��
//   ���Ұ����� �����ϴµ� �� ���� 
//   1�̸� 'A', 2 �̸� 'B', ... 26�̸� 'Z'�� �����Ѵ�.
//5. �� �迭�� ���Ұ��� ������ ���� ����Ѵ�.
//
//    10,1,3,21,6,8,11,26,22,19
//    J,A,C,U,F,H,K,Z,V,S
public class ArrayLab4 {

	public static void main(String[] args) {
		
		int[] tenInts = new int[10];
		char[] tenChars = new char[10];
		int randInt;
		char randChar;
		
		for(int i = 0; i < tenInts.length; i++) {
			
			randInt =(int)(Math.random() * 27 + 1);
			tenInts[i] = randInt;
			
			//65-90
			randChar =(char)(int)(Math.random() * 26 + 65);
			tenChars[i] = randChar;
			
		}
		
		String tenIntStr = "";
		String tenCharStr = "";
		
		for(int i = 0; i < tenChars.length; i++) {
			tenInts[i] = tenChars[i] - 64;
			tenIntStr += tenInts[i] + (i != tenChars.length - 1? ",":"");
			tenCharStr += tenChars[i] +  (i != tenChars.length - 1? ",":"");
		}
		
		System.out.println(tenIntStr);
		System.out.print(tenCharStr);
		
	}

}
