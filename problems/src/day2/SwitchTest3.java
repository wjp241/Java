package day2;

public class SwitchTest3 {
	public static void main(String[] args) {
		int score = (int)(Math.random()*101);
				
		switch(score/10) {
		case 10:
		case 9:System.out.println(score + " : A���");
			break;
		case 8:
			System.out.println(score + " : B���");
		case 7:
			System.out.println(score + " : C���");
		case 6:
			System.out.println(score + " : D���");
		default:System.out.println(score + " : F���");	


		}
		System.out.println("��������!!");

	}
}
