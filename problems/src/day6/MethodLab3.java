package day6;
//[ 실습 3 ]
//1. 클래스명 : MethodLab3
//
//2. 구현해야 하는 메서드
//    public static int getRandom(int n) 
//	1 부터 n 까지 범위의 난수 리턴
//    public static int getRandom(int n1, int n2) 
//	n1 부터 n2 범위의 난수 리턴
//
//3. main() 메서드
//       getRandom(10) 을 5번 호출하고 리턴값을 하나의 행에 출력
//	x, x, x, x, x
//
//       getRandom(10, 20) 을 5번 호출하고 리턴값을 하나의 행에 출력
//	x, x, x, x, x
@FunctionalInterface
interface GetRandomWithFiveLoops {
     void run(int ...a);
}
@FunctionalInterface
interface GetRandomInt {
	int run();
};



public class MethodLab3 {
	
	 public static int getRandom(int n) {
		 return (int)(Math.random() * n  + 1);
	 }
	
	  static int getRandom(int n1, int n2) {
		 return (int)(Math.random() * (n2-n1 + 1) + n1);
	 }
	 
	  
		static GetRandomInt getRandomFunc(int ...a) {
			GetRandomInt f = () -> a.length > 1 ? getRandom(a[0], a[1]) : getRandom(a[0]);
			return f;
		}
		
		static void  loopFiveTimes(GetRandomInt f) {
			  for(int i = 0; i < 5; i ++) { 
			 		System.out.print(f.run()  + (i != 4 ? ",":"\n"));
			  }
		  }
		  
	public static void main(String[] args) {
		
//		GetRandomWithFiveLoops f1 = (int ...a) -> {
//			for(int i = 0; i < 5; i ++) {
//		 		System.out.print((a.length > 1 ? getRandom(a[0], a[1]) : getRandom(a[0]))  + (i != 4 ? ",":"\n"));
//		 	}
//		};
//		
//		f1.run(10);
//		f1.run(10,20);
		
    	GetRandomInt f1 = getRandomFunc(10);
    	GetRandomInt f2 = getRandomFunc(10, 20);


    	loopFiveTimes(f1);
    	loopFiveTimes(f2);

		}
		
	}

