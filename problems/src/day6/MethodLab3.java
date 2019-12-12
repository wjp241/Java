package day6;
//[ �ǽ� 3 ]
//1. Ŭ������ : MethodLab3
//
//2. �����ؾ� �ϴ� �޼���
//    public static int getRandom(int n) 
//	1 ���� n ���� ������ ���� ����
//    public static int getRandom(int n1, int n2) 
//	n1 ���� n2 ������ ���� ����
//
//3. main() �޼���
//       getRandom(10) �� 5�� ȣ���ϰ� ���ϰ��� �ϳ��� �࿡ ���
//	x, x, x, x, x
//
//       getRandom(10, 20) �� 5�� ȣ���ϰ� ���ϰ��� �ϳ��� �࿡ ���
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

