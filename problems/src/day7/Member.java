package day7;

public class Member {
//	Member 객체 (인스턴스)를 3개 생성하고 
//	각각의 멤버 변수에 정보를 저장한 후에 
//	각각 정보를 추출하여 다음 형식으로 출력하는 MemberTest 클래스를 구현한다.
//
//		회원1 : 이름(계정,패스워드,생년)
//		회원2 : 이름(계정,패스워드,생년)
//		회원3 : 이름(계정,패스워드,생년)
	String name;
	String account;
	String password;
	int DOB;
//	 void printAccountInfo() {
//		 System.out.printf("회원1 : %s(%s,%s,%d)%n",this.name, this.account, this.password, this. DOB);
//	 }
	
	 Member(String name, String account, String password, int DOB) {
		this.name = name;
		this.account = account;
		this.password = password;
		this.DOB = DOB;
	}
	 


}
