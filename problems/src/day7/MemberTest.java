package day7;

public class MemberTest {
	
	 static void printAccountInfo(Member member) {
		 System.out.printf("È¸¿ø1 : %s(%s,%s,%d)%n",member.name, member.account,member.password, member. DOB);
	 }
	public static void main(String[] args) {
		Member member1 = new Member("John","John123","123",980519);
		printAccountInfo(member1);
		
		Member member2 = new Member("Josh", "Josh456","456", 980612);
		printAccountInfo(member2);

		Member member3 = new Member("Adam", "Adam789", "789", 940322);
		printAccountInfo(member3);
		
	}

}
