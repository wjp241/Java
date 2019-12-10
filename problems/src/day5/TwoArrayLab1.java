package day5;
//[실습 1]
//1. TwoArrayLab1 라는 클래스를 만든다.
//2. 4개의 행과 3개의 열을 갖는 int 타입의 2차원 배열을 생성한다.
// 
//3. 다음과 같은 구성이 되도록 생성된 2차원 배열에 데이터를 대입한다.
//
//    10, 12, 14, 16
//    18, 20, 22, 24
//    26, 28, 30, 32
//    34, 36, 38, 40


//1행 1열의 데이터 : 10
//3행 4열의 데이터 : 32
//행의 갯수 : 4
//열의 갯수 : 4
//3행의 데이터들 : 26 28 30 32
//2열의 데이터들 : 12 20 28 36
//     왼쪽 대각선 데이터들 : 10 20 30 40
//     오른쪽 대각선 데이터들 : 16 22 28 34
public class TwoArrayLab1 {
	
	public static void main(String[] args) {
		int[][] arr = new int[4][4];
		
		int num = 10;
		String thirdRow = "3행의 데이터들: ";
		String secondRow = "2행의 데이터들: ";
		String leftDiag= "왼쪽 대각선 데이터들 ";
		String rightDiag= "오른쪽 대각선 데이터들: ";


		
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
		
		
		System.out.println("1행 1열의 데이터: " + arr[0][0]);
		System.out.println("3행 4열의 데이터 : " + arr[2][3]);
		System.out.println("행의 갯수 : " + arr.length);
		System.out.println("열의 갯수 : " + arr[1].length);
		System.out.println(thirdRow);
		System.out.println(secondRow);
		System.out.println(leftDiag);
		System.out.println(rightDiag);


	}
}
