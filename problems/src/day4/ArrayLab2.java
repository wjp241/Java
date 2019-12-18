package day4;

public class ArrayLab2 {
//	1. ArrayLab2 라는 클래스를 하나 만든다.

	public static void main(String[] args) {
		
		int rand;
		int[] tenInts = new int[10];
//		2. 10개의 숫자(정수)를 저장할 수 있는 배열을 하나 만든다.

		int sum = 0;
		String allIntsStr = "모든 원소의 값: ";
		String intSumStr = "모든 원소의 합: ";
		
		for(int i = 0; i < tenInts.length; i ++) {
			
			 rand = (int)(Math.random() * 17 + 4);
//				3. 각각의 원소에  4부터 20사이의 난수를 추출하여 저장한다.
//				4. 모든 원소의 합을 구한다.
//				5. 다음과 같은 형식으로 출력한다.
			//

			tenInts[i] = rand;
			sum += rand;
			allIntsStr += rand + (i != tenInts.length - 1 ? ",":"");
			
		}
//	    모든 원소의 값 : x,x,x,x,x,x,x,x,x,x
//	    모든 원소의 합 : x
		System.out.print(allIntsStr + "\n" + intSumStr + sum);

	}

}
