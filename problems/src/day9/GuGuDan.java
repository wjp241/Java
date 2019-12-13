package day9;


class Multiplication {
	private int dan;
	private int number;
	Multiplication() {}
	
	Multiplication(int dan) {
		this.dan = dan;
	}
	
	Multiplication(int dan, int number){
		this.dan = dan;
		this.number = number;
	}
	
	void printPart() {
		
		if (number == 0) {	       
			for(int n=1; n <= 9; n++)
				System.out.print("\t"+dan + "*" + n+ "="+dan*n);
			System.out.println();
		} else {
			System.out.println(dan * number);
		}
	}
}


//1. ��� ������ �����Ͽ� GuGuDanExpr Ŭ������ �����Ѵ�.

class GuGuDanExpr extends Multiplication {
	//- Multiplication Ŭ������ ����Ѵ�.
	GuGuDanExpr(){}
	
//		GuGuDanExpr(int dan)
	GuGuDanExpr(int dan){
		super(dan);
	}
	
//		GuGuDanExpr(int dan, int number)
	GuGuDanExpr(int dan, int number) {
		super(dan, number);
	}
	
//- GuGuDanExpr Ŭ������ �޼��� ���
//		static void printAll()  
	
	static void printAll()  {
//������ ���õ� ��� ������� 1�ܺ��� 9�ܱ��� ��� ���
//		 1*1=1   1*2=2   ������������.
//		 2*1=2   2*2=4  ������������..
//				:
//  	        9*1=1   9*2=2  ������������.

		for(int i = 1; i < 10; i ++) {
			for(int j = 1; j < 10; j ++) {
				System.out.printf("%d*%d=%d ", i, j, i *j);
			}
				System.out.println();
		}
	}

}


public class GuGuDan {

	public static void main(String[] args) {
//		2. ������ ���õ� ������ �����ϴ� ���� Ŭ���� GuGuDan �� �����Ѵ�.
//		1���� 20������ ������ 2���� �����Ͽ� ���� dan ������ number ������ ��´�.
		
		int dan = (int)(Math.random() * 20 + 1);
		int number = (int)(Math.random() * 20 + 1);
		
		GuGuDanExpr guguObj = null;
//		(1) dan �� number �� ��� 1~9 �����̸� dan*number �� �������� ����Ѵ�.
		if(dan < 10 && number < 10) {
//			GuGuDanExpr ��ü�� ����(�����ڸ� ���ؼ� dan�� number�� ���� �����͸� �����Ͽ� �ʱ�ȭ�Ѵ�.)�ϰ� 
			guguObj   = new GuGuDanExpr(dan, number);
//	   	printPart() �� ȣ���Ѵ�. ���� 3, number�� 4�� ����ȴٸ� 3 * 4 = 12 �� ����Ѵ�.
			System.out.printf("%d * %d  = ",dan , number );
			guguObj.printPart();
			System.out.println();
		}
	
//		(2) dan �� 1~9 �����̰� number �� 10 �̻��̸� GuGuDanExpr ��ü�� ����
//		(�����ڸ� ���ؼ� dan�� ���� ������ �����Ͽ� �ʱ�ȭ�Ѵ�.)�ϰ� printPart() 
//		�� ȣ���Ѵ�. 

		if(dan < 10 && number >= 10) {
			guguObj  =  new GuGuDanExpr(dan);
			
			
//			����� dan�� ���ڰ� 2 ��顦.  
//					2�� : 2 * 1 = 1   2 * 2 = 2   2 * 3 = 6 ������������
			System.out.printf("%d ��:", dan);
			guguObj.printPart();
			System.out.println();
		}

		//		(3) dan �� ���� 10 �̻��̸� GuGuDanExpr �� static �޼��� printAll() �� ȣ��
//		�Ͽ� 1�ܺ��� 9�ܱ����� ������ �� ������ ����Ѵ�. 
		if(dan >= 10) {
			GuGuDanExpr.printAll();
//			1 * 1 = 1   1 * 2 = 2   1 * 3 = 3 ������������..
//			2 * 1 = 1   2 * 2 = 2   2 * 3 = 6 ������������...
//			����������..
//			9 * 1 = 9   9 * 2 = 18  9 * 3 = 27������������...
		}




	}

}
