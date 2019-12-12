package day8;

import java.util.Arrays;
import java.util.Scanner;

class GradeExpr {
	
	int jumsu[];
	GradeExpr(int jumsu[]){
		this.jumsu = new int[jumsu.length];
		System.arraycopy(jumsu, 0, this.jumsu, 0, jumsu.length );
	};
	
	
	int getTotal() {
		int sum = 0;
		for(int eleJumsu : jumsu) {
			sum += eleJumsu;
		}
		return sum;
	};
	
	double getAverage() {
		return getTotal() /(double)( jumsu.length - 1);
	};
	
	

	int getGoodScore() {
		
		int max = Integer.MIN_VALUE;
		
		for(int eleJumsu : jumsu) {
			max = Math.max(max, eleJumsu);
		}
		
		return max;
	};
	
	
	int getBadScore() {
		
		int min = Integer.MAX_VALUE;
		
		for(int eleJumsu : jumsu) {
			min = Math.min(min, eleJumsu);
		}
		
		return min;
	};
	

}


public class GradeTest {

	public static void main(String[] args) {
//		- 처리하려는 데이터의 개수를 표준 입력받는다.
		Scanner scanner = new Scanner(System.in);
		System.out.println("처리하려는 데이터의 개수를 입력하세요:");
		
//		- 입력된 데이터 개수 크기의 원소를 갖는 int 타입 배열을 생성한다.
		int[] intArr = new int[scanner.nextInt()];
		System.out.println(intArr.length);
		scanner.nextLine();

//		- 표준입력으로 데이터를 받아서 첫 번째 원소부터 마지막 원소까지 저장한다.
		System.out.println("처리하려는 데이터의 개수를 입력하세요:");
		String[] splitData = scanner.nextLine().split(" ");
		for(int i = 0; i < splitData.length; i ++) {
			intArr[i] = Integer.parseInt(splitData[i]);
		}
		
		System.out.println(Arrays.toString(intArr));
		scanner.close();
		GradeExpr instGradeExpr = new GradeExpr(intArr);
		
		
		
//		- 앞에서 만들어진 배열을 전달하면서 GradeExpr 객체를 생성한 후에 총점과 평균을 구하는 메서드를 호출하여 그 수행 결과를 다음과 같은 형식으로 화면에 표준 출력한다.
//		점수들 : xx, xx, xx, xx, xx
//		총점 : ...
//		평균 : ...
//		최고 점수 : ...
//		최저 점수 : ...
		
		String jumsus = "점수들: ";
		for(int i = 0; i < instGradeExpr.jumsu.length; i ++) {
			jumsus += instGradeExpr.jumsu[i] + ((i != instGradeExpr.jumsu.length -1 ? ",":"\n"));
		}
		
		int total = instGradeExpr.getTotal();
		double avg = instGradeExpr.getAverage();
		int max = instGradeExpr.getGoodScore();
		int min = instGradeExpr.getBadScore();
		
		System.out.printf("%s총점: %d%n평균: %f%n최고점수: %d%n최저 점수: %d", jumsus, total, avg, max, min);
		

	}

}
