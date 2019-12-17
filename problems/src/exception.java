
public class exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);
			int result = num1/num2;
			System.out.println("연산 결과 :" + result);
			
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("프로그램 아규먼트를 2개 전달하세요!");
		} catch(ArithmeticException e) {
			System.out.println("두번째 프로그램 아규먼트는 0이 아닌값을 전달하세요");
		} catch (NumberFormatException e) {
			System.out.println("프로그램 아규먼트로 숫자를 전달하세요");
		} finally {
			System.out.println("항상 수행!!");
		}
		System.out.println("수행종료");
	}

}
