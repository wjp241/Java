package day2;

public class SwitchLab2 {

	public static void main(String[] args) {
		double rand = Math.random();
		int toFiveRand = (int)(rand * 5) + 1;
		int result = 0;
		
		switch(toFiveRand) {
			case 1: result = 300 + 50;
			break;
			case 2: result = 300 - 50;
			break;
			case 3: result = 300 * 50;
			break;
			case 4: result = 300 / 50;
			break;
			default: result = 300 % 50;		
		}
		System.out.println("°á°ú°ª: " + result);

	}

}
