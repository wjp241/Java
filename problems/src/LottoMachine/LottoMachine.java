package LottoMachine;

import java.util.Random;

public class LottoMachine {
	private int nums[];
	public LottoMachine() {
		nums = new int[6];
	}
	
	
//	1-20 사이의 6 개 숫자를 추출하여 배열에 저장한다.
//	(Random 클래스를 사용한다.)

	public void createLottoNums() {
	    Random r = new Random();
	    for(int i = 0; i < 6; i++) {
	    	nums[i] = r.nextInt(20) + 1;
	    }
	}
//	6개의 모든 숫자들이 유니크한지 채크하고 중복숫자가 발견되면 DuplicateException을 발생시킨다.(throw, throws)

	public void checkLottoNums() throws DuplicateException  {
		for(int i = 0; i< 6; i++) {
			int curr = nums[i];
					
			for(int j = 1; j < 6; j++) {	
				if(j != i && curr == nums[j]) {
					throw new DuplicateException("중복된 로또 번호가 발생했습니다.");
				}
			}
		}
	}
	
//	nums 를 리턴한다.

	public int[] getNums() {
		return nums;
	}
	
}
