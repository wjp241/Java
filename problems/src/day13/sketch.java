package day13;

import java.util.HashMap;

public class sketch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> lottoNums = new HashMap<>();
		lottoNums.put("hello", 200);
		System.out.println(lottoNums.putIfAbsent("good", 100));
	}

}
