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
	//[ 실습 1 ]
	//
	//FriendTest.java 를 찾아서 day13.FriendTestLinkedList.java 로 
	//복사한다.
	//Friend 타입의 배열에 Friend 객체를 저장하는 부분을 
	//LinkedList 객체를 생성해서 저장하고 처리하는 소스로 변경하여 구현한다.
	//
	//
	public static void main(String[] args) {
		   LinkedList<Friend> friendList = new LinkedList<Friend>();
	        friendList.add(new Friend("박우재", "12345678", "multi1@naver.com"));          
	        friendList.add(new Friend("김우재", "27654321", "multi3@naver.com"));          
	        friendList.add(new Friend("정우재", "37654321", "multi4@naver.com"));    
	        friendList.add(new Friend("최우재", "47654321", "multi5@naver.com"));    

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
