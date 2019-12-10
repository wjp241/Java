package day5;

public class LottoMachine1 {
	static int generateRand() {
		return (int)(Math.random() * 46 + 1);
	}
	public static void main(String[] args) {
		
		int[] rands = new int[6];
		int rand;
		String toPrint = "오늘의 로또 번호 - ";
		
		for(int i = 0; i < rands.length; i++) {
			rand = generateRand();
			
			for(int j = 0; j < rands.length; j++) {
				
				if(rands[j] == rand) {
					
					while(rands[j] == rand) {
						rand = generateRand();
					}
					
				}
		
			}
			
			rands[i] = rand;
			toPrint += rand + (i  != rands.length - 1 ? ",": "");
				
			}
		
			System.out.print( toPrint);
			
		}
		
}
