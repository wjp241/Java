package day5;
//[�ǽ�3]
//1. TwoArrayLab3 ��� Ŭ������ �����.
//2. ���� ����� int Ÿ�� 2���� �迭�� �����Ѵ�.
//
//    1��   10, 20, 30, 40, 50
//    2��   5, 10, 15
//    3��  11, 22, 33, 44
//    4��  9, 8, 7, 6, 5, 4, 3, 2, 1
//
//3. ����� ���� ���Ͽ� ������ ���� ����Ѵ�.
//
//    1���� ���� x �Դϴ�.
//    2���� ���� x �Դϴ�.
//    3���� ���� x �Դϴ�.
//    4���� ���� x �Դϴ�.
     
public class TwoArrayLab3 {

	public static void main(String[] args) {
		int [][] intArr = new int[4][];
		int from = 0;
		int toLoop = 0;
		int by = 0;
		int sum = 0;
		
		for(int i = 0; i < intArr.length; i++) {
			switch(i) {
			case 0:
				from = 10;
				toLoop = 5;
				by = 10;
				break;
			case 1:
				from = 5;
				toLoop = 3;
				by = 5;
				break;
			case 2:
				from = 11;
				toLoop = 4;
				by = from;
				break;
			case 3:
				from = 9;
				toLoop = from;
				by = -1;
				break;
			}
			
		
				
				intArr[i] = new int[toLoop];
				intArr[i][0] =  from;
				sum = from;
				
				for(int k = 1; k < intArr[i].length; k++) {
					intArr[i][k] += intArr[i][k - 1] + by;
					sum += intArr[i][k];
				}
				
				
			System.out.println(i + "���� ����" +  sum + "�Դϴ�.");

			sum = 0;

		}
		
		
		System.out.print(java.util.Arrays.deepToString(intArr));
		
	}

}
