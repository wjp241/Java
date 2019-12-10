package day4;

public class BreakTest {

	public static void main(String[] args) {
		unico: for(int dan=1; dan <= 9; dan ++) {
			hello: for(int num=1; num <= 9; num++) {
				if(dan > 3) {
					System.out.println("insde if" + num);
					break hello;
				}
			}
			System.out.println("last print" + dan);
			
		}
	}

}
