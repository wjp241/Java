package day13;

import java.util.ArrayList;

public  class CreateList {
	ArrayList<Integer> list = new ArrayList<Integer>();
	
	public  ArrayList<Integer> convertList(int array[]){
		for(int i = array.length - 1; i >= 0; i--) {
			list.add(array[i]);
		}
		return list;
	}
}


