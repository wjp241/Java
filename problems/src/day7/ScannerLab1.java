package day7;
import java.util.Scanner;

//1. Ŭ������ : ScannerLab1 
//2. ǥ���Է����� ���� �� ���� ������ ���� �� ���� �Է¹޾Ƽ�
//    ���� ������ �����Ѵ�.
//    ù ��° ���ڸ� �Է��ϼ��� :
//    �� ��° ���ڸ� �Է��ϼ��� :
//    ������(+, -, *, /)�� �Է��ϼ��� :
//    nextInt(), nextInt(), next()
//    nextLine() -> ���� �Է½� �ٽ� ���ڷ� ��ȯ�ϴ� �۾� �ʿ�
//                        int Integer.parseInt(String)
//3. switch �� ���
//    �Էµ� �����ڰ� "+" �̸� �Էµ� �� �� ������ ������ ó���Ѵ�.
//    �Էµ� �����ڰ� "-" �̸� �Էµ� �� �� ������ ������ ó���Ѵ�.
//    �Էµ� �����ڰ� "/" �̸� �Էµ� �� �� ������ �������� ó���Ѵ�.
//    �Էµ� �����ڰ� "*" �̸� �Էµ� �� �� ������ ������ ó���Ѵ�.
//4. ����� ������ ���� ����Ѵ�.
//    
//    XX �� YY�� X ���� ����� ZZ �Դϴ�.
public class ScannerLab1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("ù ��° ���ڸ� �Է��ϼ��� :");
		int firstInt =scanner.nextInt();
		System.out.println("�� ��° ���ڸ� �Է��ϼ��� :");
		int secondInt=scanner.nextInt();
		scanner.nextLine();
		System.out.println("������(+, -, *, /)�� �Է��ϼ��� :");
		String mathOperator = scanner.nextLine();
		
		int result = 0;
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
		
		System.out.printf("%d �� %d�� %s ���� ����� %d �Դϴ�", firstInt, secondInt, mathOperator, result);
		scanner.close();
	}

}
