package day3;
//[ �ǽ� 4 ]
//1. ForLab4 �̶�� Ŭ������ �����.
//2. 3���� 10������ ������ �����Ѵ�.(ù ��° ����)
//3. 1���� 3������ ������ �����Ѵ�.(�� ��° ����)
//4. �� ��° �������� 1�̸� "*"�� ù ��° �������� ������ �ϳ��� �࿡ ����Ѵ�.
//    �� ��° �������� 2�̸� "$"�� ù ��° �������� ������ �ϳ��� �࿡ ����Ѵ�.
//    �� ��° �������� 3�̸� "#"�� ù ��° �������� ������ �ϳ��� �࿡ ����Ѵ�.
public class ForLab4{
	public static void main(String[]args) {
		//range = (max - min) + 1;
		int rand1 = (int)(Math.random()*8) + 3;
		int rand2 = (int)(Math.random()*3) + 1;
		char toPrint = ' ';
		switch(rand2) {
			case 1:
				toPrint = '*';
				break;
			case 2:
				toPrint = '$';
				break;
			default:
				toPrint = '#';
		}
		
		for(int i = 1; i <= rand1; i++) {
			System.out.print(toPrint);
		}
	}
}
