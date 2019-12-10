package day2;
/*
 * [ 실습 3 ] if 문 사용 실습
1. ConditionOperLab 이라는 클래스를 생성한다.
2. 1부터 5사이의 랜덤값을 추출한다.
3. 추출된 값이 1이면 300 과 50 의 덧셈 연산을 처리한다.
    추출된 값이 2이면 300 과 50 의 뺄셈 연산을 처리한다.
    추출된 값이 3이면 300 과 50 의 곱센 연산을 처리한다.
    추출된 값이 4이면 300 과 50 의 나눗셈 연산을 처리한다.
    추출된 값이 5이면 300 과 50 의 나머지 연산을 처리한다.
4. 출력 형식(단, 결과를 출력하는 수행문장은 한 번만 구현한다.)
    결과값 : XX
 */
public class ConditionOperLab {

	public static void main(String[] args) {
		double rand = Math.random();
		int toFiveRand = (int)(rand * 5) + 1;
		
		int result = 0;
		
		if(toFiveRand == 1) 
			result = 300 + 50;
		else if(toFiveRand == 2)
			result = 300 - 50;
		else if(toFiveRand == 3) 
			result = 300 * 50;
		else if(toFiveRand == 4) 
			result = 300 / 50;
		else 
			result = 300 % 50;
		
		System.out.println("결과값 : " + result);
		
		double doub = 0.9;
		System.out.println((int)(doub));
		
	}

}
