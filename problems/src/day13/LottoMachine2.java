package day13;

import java.util.HashSet;
import java.util.Random;

public class LottoMachine2 {
	//[ �ǽ� 2 ]
	//
	//10 ���� 30 ������ ���ڸ� 10�� �����Ͽ� ȭ�鿡 ������ ���� 
	//����ϴ� day13.LottoMachine2 ��� Ŭ������ �����Ѵ�.
	//(�ߺ� ���ڴ� ������� �ʴ´�. 
	//����Ǵ� ���ڸ� HashSet �� �����Ͽ� ó���Ѵ�.)
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
		
		System.out.printf("������ �ζ� ��ȣ : %s", lottoNums);
		
	}

}
