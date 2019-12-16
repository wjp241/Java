package day7;
import java.util.Scanner;

//1. 클래스명 : ScannerLab1 
//2. 표준입력으로 숫자 두 개와 연산자 문자 한 개를 입력받아서
//    각각 변수에 저장한다.
//    첫 번째 숫자를 입력하세요 :
//    두 번째 숫자를 입력하세요 :
//    연산자(+, -, *, /)를 입력하세요 :
//    nextInt(), nextInt(), next()
//    nextLine() -> 숫자 입력시 다시 숫자로 변환하는 작업 필요
//                        int Integer.parseInt(String)
//3. switch 문 사용
//    입력된 연산자가 "+" 이면 입력된 두 개 숫자의 덧셈을 처리한다.
//    입력된 연산자가 "-" 이면 입력된 두 개 숫자의 뺄셈을 처리한다.
//    입력된 연산자가 "/" 이면 입력된 두 개 숫자의 나눗셈을 처리한다.
//    입력된 연산자가 "*" 이면 입력된 두 개 숫자의 곱셈을 처리한다.
//4. 결과는 다음과 같이 출력한다.
//    
//    XX 와 YY의 X 연산 결과는 ZZ 입니다.
public class ScannerLab1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int firstInt;
		int secondInt;
		int result;
		int shouldContinue;
		String mathOperator;
		
		while(true) {
			System.out.println("첫 번째 숫자를 입력하세요 :");
			 firstInt =scanner.nextInt();
			System.out.println("두 번째 숫자를 입력하세요 :");
			secondInt=scanner.nextInt();
			scanner.nextLine();
			System.out.println("연산자(+, -, *, /)를 입력하세요 :");
			mathOperator = scanner.nextLine();
			
			result = 0;
			switch(mathOperator) {
			case "+":
				result = firstInt + secondInt;
				break;
			case "-":
				result = Math.abs(firstInt - secondInt);
				break;
			case "/":
				result= firstInt > secondInt ? (firstInt/secondInt) :(secondInt/firstInt);
				break;
			case "*":
				result = firstInt * secondInt;
				break;
			}
			
			System.out.printf("%d 와 %d의 %s 연산 결과는 %d 입니다\n", firstInt, secondInt, mathOperator, result);
			System.out.println("반복을 원하시면 1을 눌러주세요");
			shouldContinue = scanner.nextInt();
			if(shouldContinue != 1) {
				scanner.close();
				break;
			}
		}

	}

}
