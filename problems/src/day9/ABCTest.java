package day9;

class A {//�̰��� java.lang.object �����Ѱ���.
	int x = 0;
	A(){//�̰� ��bƮ ������ �ƴ�. �����Ϸ��� ���� �����ڰ� ����Ʈ ������
		System.out.println("A Ŭ������ ��ü ���� �մϴ�");
	}
}

class B extends A {
	int y = 2;
	B(){//�̰� ��bƮ ������ �ƴ�. �����Ϸ��� ���� �����ڰ� ����Ʈ ������
		System.out.println(super.x);
		System.out.println("A Ŭ������ ��ü ���� �մϴ�");
	}
}


class C extends B {
	C(){//�̰� ��bƮ ������ �ƴ�. �����Ϸ��� ���� �����ڰ� ����Ʈ ������
		System.out.println(super.x);
		System.out.println("C Ŭ������ ��ü ���� �մϴ�");
	}
}

public class ABCTest {

	public static void main(String[] args) {
		new C();
		// c �Ӹ� �ƴ϶� ����鵵 ��ü �����ȴ�
	}

}
