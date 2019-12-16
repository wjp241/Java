package rent;

public class TVTest {

	public static void main(String[] args) {
//	     SaleTV, RentalTV Ŭ������ ��ü�� ���� �����Ѵ�.
		SaleTV saleTVObj = new SaleTV(300000,"SALETV-1", 40, 1 );
		RentalTV rentalTVObj = new RentalTV(100000, "RENTALTV-10", 42, 1);
		saleTVObj.channelUp();
		saleTVObj.channelUp();
		
//	     RentalTV ��ü�� ä���� �� �� ������.
		rentalTVObj.channelDown();
		rentalTVObj.channelDown();
		
//	     �� ��ü�� ���Ͽ� printAllTV()�� ȣ���Ѵ�.
		printAllTV(saleTVObj);
		printAllTV(rentalTVObj);
		
//	     Rentable Ÿ���� ��ü�� RentalTV ��ü�� printRentalTV() �� ȣ���Ѵ�.

	}
	static void printAllTV(TV tv) {
	     // �ƱԸ�Ʈ�� ���޵� ��ü�� toString() �� ȣ���Ͽ� �� ��ǰ�� ������ ����Ѵ�.
		System.out.println(tv);
	     // �ƱԸ�Ʈ�� ���޵� ��ü�� play() �� ȣ���Ѵ�.    
		tv.play();
	     // tv ������ ���޵� ��ü�� SaleTV Ÿ���̸� sale() �޼��带 ȣ���Ѵ�.     
		if(tv instanceof SaleTV) {
			((SaleTV) tv).sale();
		}

	}
	   static void printRentalTV(Rentable tv) {
	     // �ƱԸ�Ʈ�� ���޵� Rentable ��ü�� rent() �޼��带 ȣ���Ѵ�.
		   tv.rent();
	   }   


}
