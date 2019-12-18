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
	 static { // 클래스 로딩 시 수행되는 블록
	 System.out.println("static 블록 수행");
	 }
	 { // 인스턴스 생성 시 수행되는 블록
	 System.out.println("인스턴스 블록 수행");
	 }
	 Block() { // 인스턴스 생성 시 호출되는 생성자
	 System.out.println("생성자 수행");
	 }
	}


	