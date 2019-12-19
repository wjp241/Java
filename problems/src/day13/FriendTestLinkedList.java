package day13;

import java.util.Iterator;
import java.util.LinkedList;

class Person {
	private String name;
	Person(String name) {
		this.name = name;
	}
	public String getInfo() {
		return name;
	}
}

class Friend extends Person {
	String phoneNum;
	String email;
	
	Friend(String name, String phoneNum, String email){
		super(name);
		this.phoneNum = phoneNum;
		this.email = email;
	}
	
	public String getInfo(){
		return super. getInfo() + " "+ phoneNum + " " + email;
	}
}

public class FriendTestLinkedList {
	//[ �ǽ� 1 ]
	//
	//FriendTest.java �� ã�Ƽ� day13.FriendTestLinkedList.java �� 
	//�����Ѵ�.
	//Friend Ÿ���� �迭�� Friend ��ü�� �����ϴ� �κ��� 
	//LinkedList ��ü�� �����ؼ� �����ϰ� ó���ϴ� �ҽ��� �����Ͽ� �����Ѵ�.
	//
	//
	public static void main(String[] args) {
		   LinkedList<Friend> friendList = new LinkedList<Friend>();
	        friendList.add(new Friend("�ڿ���", "12345678", "multi1@naver.com"));          
	        friendList.add(new Friend("�����", "27654321", "multi3@naver.com"));          
	        friendList.add(new Friend("������", "37654321", "multi4@naver.com"));    
	        friendList.add(new Friend("�ֿ���", "47654321", "multi5@naver.com"));    

	        //two ways
	        int size = friendList.size();
	        for (int cnt = 0; cnt < size; cnt++) {
	            System.out.println(friendList.get(cnt).getInfo());
	        }
	        
	        Iterator<Friend> iterator = friendList.iterator();   
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next().getInfo());
	        }


	}

}
