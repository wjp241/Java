package day5;

public class arrayPrac3 {
//	다음은 1과 9사이의 중복되지 않은 숫자로 이루어진 3자리 숫자를 만들어내는 프
//	로그램이다. (1)~(2)에 알맞은 코드를 넣어서 프로그램을 완성하시오.
	public static void main(String[] args) {
		// 큰 금액의 동전을 우선적으로 거슬러 줘야한다.
		int[] coinUnit = {500, 100, 50, 10};
		int money = 2680;
		int[] count = new int[4];
		
		System.out.println("money="+ money);
		
		for(int i=0;i<coinUnit.length;i++) {
			System.out.println(coinUnit[i]+ ": " + money / coinUnit[i] );
			money = money % coinUnit[i];
		}
		
		}
		
	}


