package day7;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = new Date();
		System.out.println(d.toString());
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println(gc.get(GregorianCalendar.DAY_OF_YEAR));
		gc = new GregorianCalendar(2019, 11, 25);
		System.out.println(gc.get(GregorianCalendar.DAY_OF_WEEK));
	}

}
