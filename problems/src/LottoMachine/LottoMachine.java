package LottoMachine;

import java.util.Random;

public class LottoMachine {
	private int nums[];
	public LottoMachine() {
		nums = new int[6];
	}
	
	
//	1-20 ������ 6 �� ���ڸ� �����Ͽ� �迭�� �����Ѵ�.
//	(Random Ŭ������ ����Ѵ�.)

	public void createLottoNums() {
	    Random r = new Random();
	    for(int i = 0; i < 6; i++) {
	    	nums[i] = r.nextInt(20) + 1;
	    }
	}
//	6���� ��� ���ڵ��� ����ũ���� äũ�ϰ� �ߺ����ڰ� �߰ߵǸ� DuplicateException�� �߻���Ų��.(throw, throws)

	public void checkLottoNums() throws DuplicateException  {
		for(int i = 0; i< 6; i++) {
			int curr = nums[i];
					
			for(int j = 1; j < 6; j++) {	
				if(j != i && curr == nums[j]) {
					throw new DuplicateException("�ߺ��� �ζ� ��ȣ�� �߻��߽��ϴ�.");
				}
			}
		}
	}
	
//	nums �� �����Ѵ�.

	public int[] getNums() {
		return nums;
	}
	
}
