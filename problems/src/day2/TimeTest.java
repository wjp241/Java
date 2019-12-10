package day2;

public class TimeTest {

	public static void main(String[] args) {

		int time = 32150;
		int hr = 32150 / 3600;
		//System.out.println(hr);
		int rem = 32150 % 3600;
		
		//System.out.println(rem);
		int min = rem / 60;
		//System.out.println(min);
		
		int sec = rem % 60;
		System.out.println(rem);
		System.out.println(hr + "시간 " + min + "분 " + sec + "초");

 	}

}
