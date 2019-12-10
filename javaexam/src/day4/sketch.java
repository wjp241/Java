package day4;


//    public class sketch extends superclass {
//    	
//    	void method() {
//    		super.method();
//    		System.out.println("In Sub Class");
//    	}
//    	
//    	public static void main(String[] args) {
//    		sketch obj = new sketch();
//    		obj.method();
//    	}
//    	
//    }
//    
//    
//    
//    class superclass {
//    	void method() {
//    		System.out.println("In Super Class");
//    	}
//    }


public class sketch extends superclass {
	static void method() {
		// super.method(); // Super keyword will not work here. As it is not overriden method
		System.out.println("In Sub Class");
	}
	@SuppressWarnings("static-access") // The static method method() from the type SubClass should be accessed in a static way
	public static void main(String[] args) {
		sketch obj = new sketch();
		obj.method();
                sketch.method();// It is same as above. Same method will be invoked
	}
}
class superclass {
	static void method() {
		System.out.println("In Super Class");
	}
}
