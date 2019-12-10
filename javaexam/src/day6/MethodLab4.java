package day6;
//[ 실습 4 ]
//
//1. 클래스명 : MethodLab4
//2. 정의해야 하는 메서드  
//   메서드명 : maxNumArray
//   매개변수 타입 : int[]
//   리턴값의 타입 : int
//
//   매개변수에 전달된 배열의 원소값들 중에서 가장 큰값 리턴
//   
//3. main() 메서드에서 maxNumArray 를 3번 호출한다.
//   다음 배열들을 전달하여
//     배열 1 : 10, 20, 30
//     배열 2 : 100, 500, 300, 200, 400
//     배열 3 : 1, 10, 3, 4, 5, 8, 7, 6, 9, 2
//   
//   호출하고 리턴값을 다음과 같이 출력한다.
//     가장 큰 값은 30 입니다.
//     가장 큰 값은 500 입니다.
//     가장 큰 값은 10 입니다.


public class MethodLab4 {
	
	static int maxNumArray(int[] intArr) {
		
		int max = Integer.MIN_VALUE;
		
			for(int k=0; k < intArr.length; k++) {
				
				if(intArr[k] > max) {
					max = intArr[k];
				}

			}
		
		return max;
	}
	


	public static void main(String[] args) {
//	     배열 1 : 10, 20, 30
//	     배열 2 : 100, 500, 300, 200, 400
//	     배열 3 : 1, 10, 3, 4, 5, 8, 7, 6, 9, 2
	//   
		
		int[] intArr1 = {10,20,30};
		int[] intArr2 = {100,500,300,200,400};
		int[] intArr3 = {1,10,3,4,5,8,7,6,9,2};
		
		
		int max1 = maxNumArray(intArr1);
		int max2 = maxNumArray(intArr2);
		int max3 = maxNumArray(intArr3);

		int[] maxes = {max1, max2, max3};
		
		String phrase1 = "가장 큰값은";
		String phrase2 = "입니다";
		
		for(int max: maxes) {
			System.out.printf("%s %d %s%n", phrase1,  max, phrase2);
		}

		
			
		}
	}


