package test;
//1. 다음과 같은 결과를 출력하는 PrintAlpha 클래스를 구현하시오.(공유폴더에서 PrintAlpha.java 를 복사하여 구현하세요.)
//
//A
//BC
//DEF
//GHIJ
//KLMNO 
public class PrintAlpha {
	public static void main(String[] args) {
//		StringBuffer alph = new StringBuffer("ABCDEFGHIJKLMNO");
//		int j = 1;
//		for(int i = 1; i <= 5; i++) {
//			System.out.println(alph.substring(j - 1, j - 1));
//			j += 2;
//		}
		StringBuffer a = new StringBuffer("abcdefghijklmno");
		String toPrint;
		int arg1 = 0;
		int arg2 = 1;
		for(int i = 0; i < 5; i++) {
			System.out.println(a.substring(arg1, arg2));
			arg1 = arg1 + (i + 1);
			arg2 = arg2 + (i + 2);  

		}

	}
}
