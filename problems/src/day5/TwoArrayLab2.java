package day5;


//[�ǽ� 2]
//1. TwoArrayLab2 ��� Ŭ������ �����.
//2. ������ ������ char Ÿ���� 2���� �迭�� �����Ѵ�.
// 
//         'B', 'C', 'A', 'A'
//         'C', 'C', 'B', 'B'
//         'D', 'A', 'A', 'D'
//
//3. 4���� ���Ҹ� ���� int Ÿ���� �迭�� �����Ѵ�.
//    ù��° ���ҿ��� 'A' ������ ����    
//    �ι�° ���ҿ��� 'B' ������ ����    
//    ����° ���ҿ��� 'C' ������ ����    
//    �׹�° ���ҿ��� 'D' ������ ����    
//    �� �����Ѵ�.
//
//4. �������
//    A �� x�� �Դϴ�.
//    B �� x�� �Դϴ�.
//    C �� x�� �Դϴ�.
//    D �� x�� �Դϴ�.	  
//  

public class TwoArrayLab2 {

	public static void main(String[] args) {

		char[][] charArr =  {{'B', 'C','A','A'}, {'C', 'C', 'B', 'B'}, {'D', 'A', 'A', 'D'}};
		int[] intArr = new int[4];
		
		for(int i = 0; i < charArr.length; i ++) {
			for(int j = 0; j < charArr[i].length; j ++) {
				intArr[charArr[i][j] - 65] += 1; 
			}
		}
		
		char alp;
		
		for(int k = 0; k < intArr.length; k++) {
			 alp = (char)(k + 65);
			 
			System.out.println(alp + "�� "+ intArr[k] + "�� �Դϴ�");
		}
		
		
		System.out.print(false + "");
	}

}
