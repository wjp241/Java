package day10;

public class PolyTest {

	public static void main(String[] args) {
		printObjectInfo(new Object());
		printObjectInfo(new String("가나다"));
		printObjectInfo("abc");
		printObjectInfo(new java.util.Date());
		printObjectInfo(new java.io.File("c:\\Temp"));
		printObjectInfo(new Object());
		printObjectInfo(new Object());
		printObjectInfo(new Object());
		
	}

	static void printObjectInfo(Object o) {
		System.out.println("전달된 객체의 클래스명 : " + o.getClass().getName());
	}
}
