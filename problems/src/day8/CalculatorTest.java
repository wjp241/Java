package day8;

import java.util.Scanner;

class CalculatorExpr {
	int num1, num2;
//	CalculatorExpr(int, int)	멤버변수 num1 과 num2 에 매개변수의 값을 초기화
//	getAddition() : int	멤버변수 num1 과 num2의 덧셈 리턴
//	getSubtraction() : int	멤버변수 num1 과 num2의 뺄셈 리턴
//	getMultiplication() : int	멤버변수 num1 과 num2의 곱셈 리턴
//	getDivision() : double	멤버변수 num1 과 num2의 나눗셈 리턴(double)

//	모든 멤버 변수에 대한 Setter 와 getter 
	CalculatorExpr(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	int getAddition() {
		return num1 + num2;
	}

	int getSubtraction() {
		return Math.abs(num1 - num2);
	}

	int getMultiplication() {
		return num1 * num2;
	}

	double getDivision() {
		return num1 <= num2 ? (num1 / (double) num2) : (num2 / (double) num1);
	}
}

public class CalculatorTest {

	public static void main(String[] args) {

//		1. 표준 입력으로 숫자를 두 개 입력받아 CalculatorExpr 객체를 생성한다. 
		Scanner scanner = new Scanner(System.in);
		System.out.println("CalculatorExpr 객체 생성을 위한 숫자 두개를 입력해주세요:");

		CalculatorExpr exprInst = new CalculatorExpr(scanner.nextInt(), scanner.nextInt());

//		2. 각 사칙연산 메서드를 호출한 결과를 다음 화면으로 출력한다.
//		추출된 숫자 : XX, XX
//		덧셈 : XX
//		뺄셈 : XX
//		곱셈 : XX
//		나눗셈 : XX

		int sum = exprInst.getAddition();
		int diff = exprInst.getSubtraction();
		int prod = exprInst.getMultiplication();
		double rem = exprInst.getDivision();

		System.out.printf("추출된 숫자: %d, %d%n덧셈: %d%n뺄셈: %d%n곱셈: %d%n나눗셈: %f", exprInst.num1, exprInst.num2, sum, diff,
				prod, rem);
		System.out.println();
		scanner.nextLine();
		System.out.println("계속 진행하겠습니까 ? Y / N:");
		// read string on java.lang chapter for expl
		if (scanner.next().equals("Y")) {
			CalculatorTest.main(null);
		} else {
			scanner.close();
		}


//		3. 계속 진행하겠는지 사용자에게 프롬프트하고 계속하겠다 하면 숫자 2개를 입력받아
//		이미 생성된 CalculatorExpr 객체에 설정하고 각 사칙연산 메서드를 호출하여
//		추출된 숫자 : XX, XX
//		덧셈 : XX
//		뺄셈 : XX
//		곱셈 : XX
//		나눗셈 : XX
//		을 출력한다.
//		4. 3번에 따라서 계속 반복할 수도 있고 종료하게 될 수도 있다.

	}

}
