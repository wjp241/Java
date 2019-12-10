package day4;
/*
[ 실습 1 ] 연산자 실습

1. ArrayLab1 이라는 클래스를 하나 만든다.
2. ary 라는 int 타입의 배열 변수를 선언하고 10개의 엘리먼트를 갖는 배열을 생성하여 대입한다.
3. 배열의 값들을 하나의 행에 다음 형식으로 출력한다.
 0 0 0 0 0 0 0 0 0 0
4. 생성된 배열에 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 을 각각의 element 로 저장한다.
5. 배열의 값들을 하나의 행에 다음 형식으로 출력한다.
 10 20 30 40 50 60 70 80 90 100
6. 배열의 값들을 하나의 행에 다음 형식으로 출력한다.
 100 90 80 70 60 50 40 30 20 10
7. 배열의 값들을 하나의 행에 다음 형식으로 출력한다.
 20 40 60 80 100
*/



public class ArrayLab1 extends Hello {
	
//	static void spacedPrint(int toPrint) {
//		System.out.print(toPrint + " ");
//	}
	
	public static void main(String[] args) {
		
//		ArrayLab1 Oops = new ArrayLab1();
//		Oops.bye();
		
		int[] ary = new int[10];
		
		for(int aryEle : ary) {
			System.out.print(aryEle + " ");
			//spacedPrint(aryEle);

		}

		System.out.println();
		
		for(int i = 0; i < ary.length ; i ++) {
			ary[i] = (i + 1) * 10; 
			System.out.print(ary[i] + " ");
			//spacedPrint(ary[i]);
		}
		
		System.out.println();

		for(int i = ary.length - 1; i >= 0 ; i --) {
			System.out.print(ary[i] + " ");
			//spacedPrint(ary[i]);

		}
				
		System.out.println();
		
		for(int i = 1; i <= ary.length ; i += 2) {
			System.out.print(ary[i] + " ");
			//spacedPrint(ary[i]);

		}
		
	}

}
