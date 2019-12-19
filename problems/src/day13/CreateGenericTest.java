package day13;
import java.util.Date;

class Card{
	int hello = 5;
}
public class CreateGenericTest {
	public static void main(String[] args) {
		Value1 o1 = new Value1();
		o1.put("abc");
		String s1 = o1.get(); 
		System.out.println(s1);		
		
		Value2 o2 = new Value2();
		o2.put("abc");
		String s2 = (String)o1.get(); 
		System.out.println(s2);
		
		Value3<String> o3 = new Value3<>();		
		o3.put("abc");
		String s3 = (String)o3.get(); 
		System.out.println(s3);	
		
		Value3<Date> o4 = new Value3<Date>();		
		o4.put(new Date());
		Date s4 = o4.get(); 
		System.out.println(s4);	
		
		Value3<Card> v = new Value3<>();
		v.put(new Card());
		System.out.println(v.get().hello);
	}
}

class Value3<TT> {
	TT obj;
	void put(TT obj){
		this.obj = obj;
	}
	TT get() {
		return obj;
	}
}


class Value1 {
	String obj;
	void put(String obj){
		this.obj = obj;
	}
	String get() {
		return obj;
	}
}


class Value2 {
	Object obj;
	void put(Object obj){
		this.obj = obj;
	}
	Object get() {
		return obj;
	}
}
















