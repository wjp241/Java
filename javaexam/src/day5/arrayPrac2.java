package day5;

public class arrayPrac2 {

	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50};
		int sum = 0;
		for (int ele : arr) {
			sum += ele;
		}
		
		System.out.println("sum="+sum);
	}

}
