package day3;
//[ 실습3 ] 모양 출력(중첩 for)
//1. ForLab6 라는 클래스를 생성한다.
//2. 다음과 같은 결과가 되도록 구현한다.
//
// A
//	BC
//	DEF
//	GHIJ
//	KLMNO
//	
public class ForLab8 {

	public static void main(String[] args) {
		
		char alph = 'A'; 

		for(int i = 1; i  <= 5; i ++) {
			
			
			for(int j = 1; j <= i; j++) {
				System.out.print(alph ++);
			}
			
			System.out.print( "\n");
		}
	}

}
