package day3;
//[ 실습 4 ]
//1. ForLab4 이라는 클래스를 만든다.
//2. 3부터 10사이의 난수를 추출한다.(첫 번째 난수)
//3. 1부터 3사이의 난수를 추출한다.(두 번째 난수)
//4. 두 번째 난수값이 1이면 "*"을 첫 번째 난수값의 갯수로 하나의 행에 출력한다.
//    두 번째 난수값이 2이면 "$"을 첫 번째 난수값의 갯수로 하나의 행에 출력한다.
//    두 번째 난수값이 3이면 "#"을 첫 번째 난수값의 갯수로 하나의 행에 출력한다.
public class ForLab4{
	public static void main(String[]args) {
		//range = (max - min) + 1;
		int rand1 = (int)(Math.random()*8) + 3;
		int rand2 = (int)(Math.random()*3) + 1;
		char toPrint = ' ';
		switch(rand2) {
			case 1:
				toPrint = '*';
				break;
			case 2:
				toPrint = '$';
				break;
			default:
				toPrint = '#';
		}
		
		for(int i = 1; i <= rand1; i++) {
			System.out.print(toPrint);
		}
	}
}
