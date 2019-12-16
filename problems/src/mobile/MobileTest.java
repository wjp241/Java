package mobile;

public class MobileTest {
	
    public static void printMobile(Mobile mobile) {
    	System.out.printf("\t%s\t%d\t%s%n", mobile.getMobileName(), mobile.getBatterySize(), mobile.getOsType());
    }
    public static void printTitle() {
    	System.out.println("\tMobile\tBattery\tOS\n --------------------------------------------------------");
    }

	public static void main(String[] args) {
  	  // ������ Mobile ��ü�� �����Ѵ�.
		Ltab mobileObj = new Ltab("Ltab",	500, 	"ABC-01");
		Otab mobileObj2 = new Otab("Otab",	1000,	"XYZ-20");
		
    	printTitle();
		printMobile(mobileObj);
		printMobile(mobileObj2);
		
        // ������ ��ü�� ������ ����Ѵ�.(printMobile() ȣ��)
		
        // ������ Mobile ��ü�� 10�о� ������ �Ѵ�. 
		mobileObj.charge(10);
		mobileObj2.charge(10);
        // 10�� ���� �� ��ü ������ ����Ѵ�.(printMobile() ȣ��)
    	printTitle();
		printMobile(mobileObj);
		printMobile(mobileObj2);
        // ������ Mobile ��ü�� 5�о� ��ȭ�� �Ѵ�.
		mobileObj.operate(5);
		mobileObj2.operate(5);
        // 5�� ��ȭ �� ��ü ������ ����Ѵ�.(printMobile() ȣ��)

    	printTitle();
    	printMobile(mobileObj);
    	printMobile(mobileObj2);
	}
	
//  Mobile         	Battery           	OS
	// --------------------------------------------------------
	//   Ltab              	500            		ABC-01
	//   Otab              1000           		XYZ-20
	//
//[ 10�� ���� ]
//    Mobile          	Battery           	OS
// --------------------------------------------------------
//   Ltab              	600             	ABC-01
//   Otab              1080            	XYZ-20
//
//[ 5�� ��ȭ ]
//    Mobile          	Battery        	        OS
// --------------------------------------------------------
//   Ltab             	550             	ABC-01
//   Otab              1020            	XYZ-20


}
