package day4;

public class WhileLab3 {

	public static void main(String[] args) {
		Boolean shouldRun = true;
		
		int loopCount = 0;
		int rand;
		char alph;
		while(shouldRun) {
			
			loopCount ++;
			rand = (int)(Math.random () * 30);
			
			if(rand == 0 ||(rand <= 30 && rand >= 27)) {
				
				shouldRun = false;
				
			} else {
				
				 alph =(char)( '@'+ rand);

				
				System.out.print(alph + "(" + rand + ")" + "\n");
			}
				
		}
		
		System.out.print("수행횟수는 " +  loopCount + "번 입니다");

	}

}
