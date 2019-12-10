package day3;
//[ 실습 1 ] 모양 출력(중첩 for)
//1. ForLab4 라는 클래스를 만든다.
//2. char 타입으로 변수를 하나 만들어 '&'로 초기화 한다.
//3. 5부터 10사이의 난수를 하나 추출한다.
//4. 추출된 숫자가 5라면 반복문을 사용하여 다음과 같이 출력한다.
//
//	&
//	&&
//	&&&
//	&&&&
//	&&&&&
//    
//     추출된 숫자가 7이라면 반복문을 사용하여 다음과 같이 출력한다.
//
//	&
//	&&
//	&&&
//	&&&&
//	&&&&&
//	&&&&&&
//	&&&&&&&
//
public class ForLab6 {
	public static void main(String[] args) {
		
		final char and = '&';
		int randNum = (int)(Math.random() * 6 ) + 5;
		
		for(int i = 1; i  <= randNum ; i++) {
			
			for(int j= 1; j <= i; j++) {
				
				if(j != i) {
					System.out.print(and);
				} else {
					System.out.println();
				}
			}
			
		}
		
//		String five = "&";
//		int randNum =(int)(Math.random() * 6) + 5;
//		
//		for(int i = 1; i <= randNum; i++) {
//			System.out.println(five);
//			five += "&";
//		}
		
				
		
	}
}
