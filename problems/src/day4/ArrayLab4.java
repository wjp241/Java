package day4;
//[ 실습 4 ]
//1. ArrayLab4 이라는 클래스를 하나 만든다.
//2. 10 개의 원소를 갖는 int 타입의 배열을 생성한 후에 이 배열의 
//   각각의 원소값으로 1부터 26 사이의 난수를 추출하여 저장한다.
//3. 10개의 원소를 갖는 char 타입의 배열을 생성한다.
//4. 2번에서 생성한 배열의 각각의 원소값의 3번에서 생성한 배열의
//   원소값으로 저장하는데 이 때는 
//   1이면 'A', 2 이면 'B', ... 26이면 'Z'를 저장한다.
//5. 두 배열의 원소값을 다음과 같이 출력한다.
//
//    10,1,3,21,6,8,11,26,22,19
//    J,A,C,U,F,H,K,Z,V,S
public class ArrayLab4 {

	public static void main(String[] args) {
		
		int[] tenInts = new int[10];
		char[] tenChars = new char[10];
		int randInt;
		char randChar;
		
		for(int i = 0; i < tenInts.length; i++) {
			
			randInt =(int)(Math.random() * 27 + 1);
			tenInts[i] = randInt;
			
			//65-90
			randChar =(char)(int)(Math.random() * 26 + 65);
			tenChars[i] = randChar;
			
		}
		
		String tenIntStr = "";
		String tenCharStr = "";
		
		for(int i = 0; i < tenChars.length; i++) {
			tenInts[i] = tenChars[i] - 64;
			tenIntStr += tenInts[i] + (i != tenChars.length - 1? ",":"");
			tenCharStr += tenChars[i] +  (i != tenChars.length - 1? ",":"");
		}
		
		System.out.println(tenIntStr);
		System.out.print(tenCharStr);
		
	}

}
