
public class exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);
			int result = num1/num2;
			System.out.println("���� ��� :" + result);
			
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("���α׷� �ƱԸ�Ʈ�� 2�� �����ϼ���!");
		} catch(ArithmeticException e) {
			System.out.println("�ι�° ���α׷� �ƱԸ�Ʈ�� 0�� �ƴѰ��� �����ϼ���");
		} catch (NumberFormatException e) {
			System.out.println("���α׷� �ƱԸ�Ʈ�� ���ڸ� �����ϼ���");
		} finally {
			System.out.println("�׻� ����!!");
		}
		System.out.println("��������");
	}

}
