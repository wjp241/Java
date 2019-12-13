package day9;

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

public class FriendTest {

	public static void main(String[] args) {
		Friend[] friendObjects = new Friend[5];
		friendObjects[0] = new Friend("�ڿ���", "12345678", "multi1@naver.com");
		friendObjects[1] = new Friend("�̿���", "87654321", "multi2@naver.com");
		friendObjects[2] = new Friend("�����", "27654321", "multi3@naver.com");
		friendObjects[3] = new Friend("������", "37654321", "multi4@naver.com");
		friendObjects[4] = new Friend("�ֿ���", "47654321", "multi5@naver.com");
		
		for(Friend friend:friendObjects) {
			System.out.println(friend.getInfo());

		}

	}

}
