package day2;

public class SwitchTest3 {
	public static void main(String[] args) {
		int score = (int)(Math.random()*101);
				
		switch(score/10) {
		case 10:
		case 9:System.out.println(score + " : A등급");
			break;
		case 8:
			System.out.println(score + " : B등급");
		case 7:
			System.out.println(score + " : C등급");
		case 6:
			System.out.println(score + " : D등급");
		default:System.out.println(score + " : F등급");	


		}
		System.out.println("수행종료!!");

	}
}
