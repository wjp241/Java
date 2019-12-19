package day13;

import java.util.HashSet;
import java.util.Random;

public class LottoMachine2 {
	//[ 실습 2 ]
	//
	//10 부터 30 까지의 숫자를 10개 추출하여 화면에 다음과 같이 
	//출력하는 day13.LottoMachine2 라는 클래스를 구현한다.
	//(중복 숫자는 허용하지 않는다. 
	//추출되는 숫자를 HashSet 에 저장하여 처리한다.)
	//
	
	static int createLottoNums() {
			 
	    return new Random().nextInt(21) + 10;
	}
	
	public static void main(String[] args) {
		HashSet<Integer> lottoNums = new HashSet<>();
		
		while(lottoNums.size()!= 10) {
			int lottoNum = createLottoNums();
			lottoNums.add(lottoNum);
		}
		
		System.out.printf("오늘의 로또 번호 : %s", lottoNums);
		
	}

}
