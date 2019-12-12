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
//		- ó���Ϸ��� �������� ������ ǥ�� �Է¹޴´�.
		Scanner scanner = new Scanner(System.in);
		System.out.println("ó���Ϸ��� �������� ������ �Է��ϼ���:");
		
//		- �Էµ� ������ ���� ũ���� ���Ҹ� ���� int Ÿ�� �迭�� �����Ѵ�.
		int[] intArr = new int[scanner.nextInt()];
		System.out.println(intArr.length);
		scanner.nextLine();

//		- ǥ���Է����� �����͸� �޾Ƽ� ù ��° ���Һ��� ������ ���ұ��� �����Ѵ�.
		System.out.println("ó���Ϸ��� �������� ������ �Է��ϼ���:");
		String[] splitData = scanner.nextLine().split(" ");
		for(int i = 0; i < splitData.length; i ++) {
			intArr[i] = Integer.parseInt(splitData[i]);
		}
		
		System.out.println(Arrays.toString(intArr));
		scanner.close();
		GradeExpr instGradeExpr = new GradeExpr(intArr);
		
		
		
//		- �տ��� ������� �迭�� �����ϸ鼭 GradeExpr ��ü�� ������ �Ŀ� ������ ����� ���ϴ� �޼��带 ȣ���Ͽ� �� ���� ����� ������ ���� �������� ȭ�鿡 ǥ�� ����Ѵ�.
//		������ : xx, xx, xx, xx, xx
//		���� : ...
//		��� : ...
//		�ְ� ���� : ...
//		���� ���� : ...
		
		String jumsus = "������: ";
		for(int i = 0; i < instGradeExpr.jumsu.length; i ++) {
			jumsus += instGradeExpr.jumsu[i] + ((i != instGradeExpr.jumsu.length -1 ? ",":"\n"));
		}
		
		int total = instGradeExpr.getTotal();
		double avg = instGradeExpr.getAverage();
		int max = instGradeExpr.getGoodScore();
		int min = instGradeExpr.getBadScore();
		
		System.out.printf("%s����: %d%n���: %f%n�ְ�����: %d%n���� ����: %d", jumsus, total, avg, max, min);
		

	}

}
