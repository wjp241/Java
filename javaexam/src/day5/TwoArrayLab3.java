package day5;
//[실습3]
//1. TwoArrayLab3 라는 클래스를 만든다.
//2. 다음 사양의 int 타입 2차원 배열을 생성한다.
//
//    1행   10, 20, 30, 40, 50
//    2행   5, 10, 15
//    3행  11, 22, 33, 44
//    4행  9, 8, 7, 6, 5, 4, 3, 2, 1
//
//3. 행단위 합을 구하여 다음과 같이 출력한다.
//
//    1행의 합은 x 입니다.
//    2행의 합은 x 입니다.
//    3행의 합은 x 입니다.
//    4행의 합은 x 입니다.
     
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
				
				
			System.out.println(i + "행의 합은" +  sum + "입니다.");

			sum = 0;

		}
		
		
		System.out.print(java.util.Arrays.deepToString(intArr));
		
	}

}
