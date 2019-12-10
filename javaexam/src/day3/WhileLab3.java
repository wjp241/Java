package day3;

//[ 실습3 ]
//1. WhileLab3 이라는 클래스를 생성한다.
//2. 0부터 30사이의 난수를 추출한다.
//  추출된 숫자가 1이면 'A', 2 이면 'B', ... 26이면 'Z' 를 출력하는데
//  계속 난수 추출과 문자출력을 반복하다가 난수가 0이 추출되거나
//  27~30이 추출되면 반복을 끝낸다.
//  반복하는 동안 출력형식 :  	B(2)
//  			A(1)
//			D(4)
//			  :
//  마지막에는 "수행횟수는 x 번입니다"를 출력하고 종료한다.
public class WhileLab3 {

	public static void main(String[] args) {
		Boolean shouldRun = true;
		
		int loopCount = 0;

		while(shouldRun) {
			
			loopCount ++;
			int rand = (int)(Math.random () * 31);
			
			if(rand == 0 ||(rand <= 30 && rand >= 27)) {
				
				shouldRun = false;
				
			} else {
				
				char  alph =(char)( '@'+ rand);

				
				System.out.print(alph + "(" + rand + ")" + "\n");
			}
				
		}
		
		System.out.print("수행횟수는 " +  loopCount + "번 입니다");

	}

}
