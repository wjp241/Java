package day5;

public class arrayPrac {

	public static void main(String[] args) {
		int[][] arr = {
				{ 5, 5, 5, 5, 5},
				{10,10,10,10,10},
				{20,20,20,20,20},
				{30,30,30,30,30}
				};
				int total = 0;
				float average = 0;
				
				for(int[] innerArr: arr) {
					for(int intEle: innerArr) {
						total += intEle;
						average += 1;
					}
				}
				average = total * (1 / average);
				
				System.out.println("total="+total);
				System.out.println("average="+average);
		}
		
	}


