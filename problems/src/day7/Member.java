package day7;

public class Member {
//	Member ��ü (�ν��Ͻ�)�� 3�� �����ϰ� 
//	������ ��� ������ ������ ������ �Ŀ� 
//	���� ������ �����Ͽ� ���� �������� ����ϴ� MemberTest Ŭ������ �����Ѵ�.
//
//		ȸ��1 : �̸�(����,�н�����,����)
//		ȸ��2 : �̸�(����,�н�����,����)
//		ȸ��3 : �̸�(����,�н�����,����)
	String name;
	String account;
	String password;
	int DOB;
//	 void printAccountInfo() {
//		 System.out.printf("ȸ��1 : %s(%s,%s,%d)%n",this.name, this.account, this.password, this. DOB);
//	 }
	
	 Member(String name, String account, String password, int DOB) {
		this.name = name;
		this.account = account;
		this.password = password;
		this.DOB = DOB;
	}
	 


}
