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
	
	 Member(String name, String account, String password, int DOB) {
		this.name = name;
		this.account = account;
		this.password = password;
		this.DOB = DOB;
	}
	 
	 void printAccountInfo() {
		 System.out.printf("ȸ��1 : %s(%s,%s,%d)%n",this.name, this.account, this.password, this. DOB);
	 }
	
	public static void main(String[] args) {
		Member member1 = new Member("John","John123 ","123",980519);
		member1.printAccountInfo();
		
		Member member2 = new Member("Josh", "Josh456","456", 980612);
		member2.printAccountInfo();

		Member member3 = new Member("Adam", "Adam789", "789", 940322);
		member3.printAccountInfo();

		

		
	}

}
