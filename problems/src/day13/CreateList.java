package day13;

import java.util.ArrayList;

public  class CreateList {
	public static ArrayList<Integer> convertList(int array[]){
		ArrayList<Integer> list = new ArrayList<>();
		for(int num:array) {
			list.add(num);
		}
		return list;
	}
}
