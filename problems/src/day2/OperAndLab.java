package day2;

public class OperAndLab {

	public static void main(String[] args) {
		double rand = Math.random();
		int grade = (int)(rand * 6) + 1;
		if(grade < 4 && grade > 0) System.out.println(grade + "학년은 저학년입니다");
		if(grade > 3  && grade < 7) System.out.println(grade + "학년은 고학년입니다");
		
		
	}

}
