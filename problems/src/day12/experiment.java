package day12;

//class A {
//	static int num = 0;
//	int hello;
//	A(){
//		System.out.println("A() constructor was invoked");
//	}
//	A(int a, int b, int c) {
//		hello = a;
//	}
//}
//
//
//class B extends A {
//	B(){
//		System.out.println(A.num);
//	}
//
//	B(int a, int b, int c) {
//		super(a,b,c);
//		System.out.println(this.hello);
//		A.num = 2;
//		System.out.println(A.num);
//	}
//}
//
public class experiment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		new B(1,2,3);
//		Class.forName(Block);
	}

}
class Block {
	 static { // Ŭ���� �ε� �� ����Ǵ� ���
	 System.out.println("static ��� ����");
	 }
	 { // �ν��Ͻ� ���� �� ����Ǵ� ���
	 System.out.println("�ν��Ͻ� ��� ����");
	 }
	 Block() { // �ν��Ͻ� ���� �� ȣ��Ǵ� ������
	 System.out.println("������ ����");
	 }
	}


	