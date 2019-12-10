package day5;
//[�ǽ� 1]
//1. TwoArrayLab1 ��� Ŭ������ �����.
//2. 4���� ��� 3���� ���� ���� int Ÿ���� 2���� �迭�� �����Ѵ�.
// 
//3. ������ ���� ������ �ǵ��� ������ 2���� �迭�� �����͸� �����Ѵ�.
//
//    10, 12, 14, 16
//    18, 20, 22, 24
//    26, 28, 30, 32
//    34, 36, 38, 40


//1�� 1���� ������ : 10
//3�� 4���� ������ : 32
//���� ���� : 4
//���� ���� : 4
//3���� �����͵� : 26 28 30 32
//2���� �����͵� : 12 20 28 36
//     ���� �밢�� �����͵� : 10 20 30 40
//     ������ �밢�� �����͵� : 16 22 28 34
public class TwoArrayLab1 {
	
	public static void main(String[] args) {
		int[][] arr = new int[4][4];
		
		int num = 10;
		String thirdRow = "3���� �����͵�: ";
		String secondRow = "2���� �����͵�: ";
		String leftDiag= "���� �밢�� �����͵� ";
		String rightDiag= "������ �밢�� �����͵�: ";


		
		for(int i  = 0; i < arr.length; i ++) {
	
			for(int j = 0; j < arr[i].length; j ++) {
				arr[i][j] = num;
				num += 2;
				
				
				switch(i) {
					case 1:
						secondRow += arr[i][j] + (j != arr[i].length - 1?  " ": "");
						break;
					case 2:
						thirdRow += arr[i][j] + (j != arr[i].length - 1? " ": "");
						break;
				
				}
				
				if(i == j) {
					leftDiag  += arr[i][j] + (j != arr[i].length - 1? " ": "");
				}
				
	
			}
			rightDiag += arr[i][(arr[0].length - 1)- i]  + (i  != arr[i].length - 1? " ": "");

		}
		
		
		System.out.println("1�� 1���� ������: " + arr[0][0]);
		System.out.println("3�� 4���� ������ : " + arr[2][3]);
		System.out.println("���� ���� : " + arr.length);
		System.out.println("���� ���� : " + arr[1].length);
		System.out.println(thirdRow);
		System.out.println(secondRow);
		System.out.println(leftDiag);
		System.out.println(rightDiag);


	}
}
