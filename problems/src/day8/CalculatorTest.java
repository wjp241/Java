package day8;

import java.util.Scanner;

class CalculatorExpr {
	int num1, num2;
//	CalculatorExpr(int, int)	������� num1 �� num2 �� �Ű������� ���� �ʱ�ȭ
//	getAddition() : int	������� num1 �� num2�� ���� ����
//	getSubtraction() : int	������� num1 �� num2�� ���� ����
//	getMultiplication() : int	������� num1 �� num2�� ���� ����
//	getDivision() : double	������� num1 �� num2�� ������ ����(double)

//	��� ��� ������ ���� Setter �� getter 
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

//		1. ǥ�� �Է����� ���ڸ� �� �� �Է¹޾� CalculatorExpr ��ü�� �����Ѵ�. 
		Scanner scanner = new Scanner(System.in);
		System.out.println("CalculatorExpr ��ü ������ ���� ���� �ΰ��� �Է����ּ���:");

		CalculatorExpr exprInst = new CalculatorExpr(scanner.nextInt(), scanner.nextInt());

//		2. �� ��Ģ���� �޼��带 ȣ���� ����� ���� ȭ������ ����Ѵ�.
//		����� ���� : XX, XX
//		���� : XX
//		���� : XX
//		���� : XX
//		������ : XX

		int sum = exprInst.getAddition();
		int diff = exprInst.getSubtraction();
		int prod = exprInst.getMultiplication();
		double rem = exprInst.getDivision();

		System.out.printf("����� ����: %d, %d%n����: %d%n����: %d%n����: %d%n������: %f", exprInst.num1, exprInst.num2, sum, diff,
				prod, rem);
		System.out.println();
		scanner.nextLine();
		System.out.println("��� �����ϰڽ��ϱ� ? Y / N:");
		// read string on java.lang chapter for expl
		if (scanner.next().equals("Y")) {
			CalculatorTest.main(null);
		} else {
			scanner.close();
		}


//		3. ��� �����ϰڴ��� ����ڿ��� ������Ʈ�ϰ� ����ϰڴ� �ϸ� ���� 2���� �Է¹޾�
//		�̹� ������ CalculatorExpr ��ü�� �����ϰ� �� ��Ģ���� �޼��带 ȣ���Ͽ�
//		����� ���� : XX, XX
//		���� : XX
//		���� : XX
//		���� : XX
//		������ : XX
//		�� ����Ѵ�.
//		4. 3���� ���� ��� �ݺ��� ���� �ְ� �����ϰ� �� ���� �ִ�.

	}

}
