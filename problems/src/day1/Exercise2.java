package day1;
/* 
 다음에 제시된 두 개의 정수데이터(리터럴)를 
변수를 선언하여 저장하고 
나눈 몫과 나머지를 구하여 제시된 출력 형식과 같이 
출력하는 프로그램을 작성하시오. 

작성 클래스명 : Exercise2

35, 10

[ 출력 결과 ]

35 를 10 으로 나눈 결과 몫은 3 이고 나머지는 5 입니다.*/

public class Exercise2 {

	public static void main(String[] args) {
		int num1 = 35;
		int num2 = 10;
		int result = num1 / num2;
		int remainder = num1 % num2;
		
		System.out.println(num1 + " 를 " + num2 + " 으로 나눈 결과 몫은 " + result + " 이고 나머지는 " + remainder + " 입니다.");
		
	}

}
