package mobile;

public class MobileTest {
	
    public static void printMobile(Mobile mobile) {
    	System.out.printf("\t%s\t%d\t%s%n", mobile.getMobileName(), mobile.getBatterySize(), mobile.getOsType());
    }
    public static void printTitle() {
    	System.out.println("\tMobile\tBattery\tOS\n --------------------------------------------------------");
    }

	public static void main(String[] args) {
  	  // 각각의 Mobile 객체를 생성한다.
		Ltab mobileObj = new Ltab("Ltab",	500, 	"ABC-01");
		Otab mobileObj2 = new Otab("Otab",	1000,	"XYZ-20");
		
    	printTitle();
		printMobile(mobileObj);
		printMobile(mobileObj2);
		
        // 생성된 객체의 정보를 출력한다.(printMobile() 호출)
		
        // 각각의 Mobile 객체에 10분씩 충전을 한다. 
		mobileObj.charge(10);
		mobileObj2.charge(10);
        // 10분 충전 후 객체 정보를 출력한다.(printMobile() 호출)
    	printTitle();
		printMobile(mobileObj);
		printMobile(mobileObj2);
        // 각각의 Mobile 객체에 5분씩 통화를 한다.
		mobileObj.operate(5);
		mobileObj2.operate(5);
        // 5분 통화 후 객체 정보를 출력한다.(printMobile() 호출)

    	printTitle();
    	printMobile(mobileObj);
    	printMobile(mobileObj2);
	}
	
//  Mobile         	Battery           	OS
	// --------------------------------------------------------
	//   Ltab              	500            		ABC-01
	//   Otab              1000           		XYZ-20
	//
//[ 10분 충전 ]
//    Mobile          	Battery           	OS
// --------------------------------------------------------
//   Ltab              	600             	ABC-01
//   Otab              1080            	XYZ-20
//
//[ 5분 통화 ]
//    Mobile          	Battery        	        OS
// --------------------------------------------------------
//   Ltab             	550             	ABC-01
//   Otab              1020            	XYZ-20


}
