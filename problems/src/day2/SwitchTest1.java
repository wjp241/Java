package day2;

public class SwitchTest1 {
	public static void main(String[] args) {
		int num = (int)(Math.random()*10) +1;
		switch(num % 2) {
		case 0:
			System.out.println(num + " : Â¦¼ö");
			break;
		case 1:
			System.out.println(num + " : È¦¼ö");
		}
		
		
		if(num % 2 == 0)
			System.out.println(num + " : Â¦¼ö");
		else
			System.out.println(num + " : È¦¼ö");

	}
}
