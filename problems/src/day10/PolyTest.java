package day10;

public class PolyTest {

	public static void main(String[] args) {
		printObjectInfo(new Object());
		printObjectInfo(new String("������"));
		printObjectInfo("abc");
		printObjectInfo(new java.util.Date());
		printObjectInfo(new java.io.File("c:\\Temp"));
		printObjectInfo(new Object());
		printObjectInfo(new Object());
		printObjectInfo(new Object());
		
	}

	static void printObjectInfo(Object o) {
		System.out.println("���޵� ��ü�� Ŭ������ : " + o.getClass().getName());
	}
}
