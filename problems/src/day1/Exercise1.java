package day1;
/*  다음에 제시된 세 개의 정수데이터(리터럴)를 
변수를 선언하여 저장하고 합계와 평균을 
구하여 제시된 출력 형식과 같이 출력하는 프로그램을 작성하시오. 
(평균의 소수 이하는 고려하지 않는다.)

작성 클래스명 : Exercise1

10, 25, 33

[ 출력 형식 ]

합계 : 68
평균 : 22

 */
public class Exercise1 {

	public static void main(String[] args) {
		int num1 = 10, num2 = 25, num3 = 33;
		int sum = num1 + num2 + num3;
		int avg = sum / 3;
		String sumStr = "합계 : " + sum;
		String avgStr = "평균 : " + avg;
		String resultStr = sumStr + "\n" + avgStr; 
//		System.out.println(resultStr);
		
	}

}
