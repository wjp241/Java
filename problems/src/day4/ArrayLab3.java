package day4;

public class ArrayLab3 {

//[ 실습 3 ]
//1. ArrayLab3 라는 클래스를 하나 만든다.


	public static void main(String[] args) {
		
		char[] java = {'J','a','v','a'};
		//2. 'J', 'a', 'v', 'a' 라는 원소들로 구성되는 char 타입의 배열을
	//   만든다.

		String resStr = "수행 결과:\n\n변환된 배열: ";

		for(int i = 0; i < java.length; i++) {
			//3. 각 원소들의 값에서 대문자는 소문자로 소문자는 대문자로 
//		    변환한다.

			if((int)java[i] < 97) {
				
//				java[i] = (char)(java[i] + 32);
				java[i] +=  32;


			} else {
				
//				java[i] = (char)(java[i] - 32);
				java[i] -= 32;

				
			}
			
			resStr += java[i] + (i != java.length -1 ? ",":"");

		}
		//4. 수행 결과 :
		//
//		    변환된 배열 : j,A,V,A
		System.out.print(resStr);
		
	}

}
