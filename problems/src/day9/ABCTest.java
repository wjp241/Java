package day9;

class A {//이것은 java.lang.object 연장한것임.
	int x = 0;
	A(){//이건 디폹트 생성자 아님. 컴파일러가 만든 생성자가 디폴트 생성자
		System.out.println("A 클래스를 객체 생성 합니다");
	}
}

class B extends A {
	int y = 2;
	B(){//이건 디폹트 생성자 아님. 컴파일러가 만든 생성자가 디폴트 생성자
		System.out.println(super.x);
		System.out.println("A 클래스를 객체 생성 합니다");
	}
}


class C extends B {
	C(){//이건 디폹트 생성자 아님. 컴파일러가 만든 생성자가 디폴트 생성자
		System.out.println(super.x);
		System.out.println("C 클래스를 객체 생성 합니다");
	}
}

public class ABCTest {

	public static void main(String[] args) {
		new C();
		// c 뿐만 아니라 조상들도 객체 생성된다
	}

}
