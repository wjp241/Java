package day4;
/*
[ �ǽ� 1 ] ������ �ǽ�

1. ArrayLab1 �̶�� Ŭ������ �ϳ� �����.
2. ary ��� int Ÿ���� �迭 ������ �����ϰ� 10���� ������Ʈ�� ���� �迭�� �����Ͽ� �����Ѵ�.
3. �迭�� ������ �ϳ��� �࿡ ���� �������� ����Ѵ�.
 0 0 0 0 0 0 0 0 0 0
4. ������ �迭�� 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 �� ������ element �� �����Ѵ�.
5. �迭�� ������ �ϳ��� �࿡ ���� �������� ����Ѵ�.
 10 20 30 40 50 60 70 80 90 100
6. �迭�� ������ �ϳ��� �࿡ ���� �������� ����Ѵ�.
 100 90 80 70 60 50 40 30 20 10
7. �迭�� ������ �ϳ��� �࿡ ���� �������� ����Ѵ�.
 20 40 60 80 100
*/



public class ArrayLab1 extends Hello {
	
//	static void spacedPrint(int toPrint) {
//		System.out.print(toPrint + " ");
//	}
	
	public static void main(String[] args) {
		
//		ArrayLab1 Oops = new ArrayLab1();
//		Oops.bye();
		
		int[] ary = new int[10];
		
		for(int aryEle : ary) {
			System.out.print(aryEle + " ");
			//spacedPrint(aryEle);

		}

		System.out.println();
		
		for(int i = 0; i < ary.length ; i ++) {
			ary[i] = (i + 1) * 10; 
			System.out.print(ary[i] + " ");
			//spacedPrint(ary[i]);
		}
		
		System.out.println();

		for(int i = ary.length - 1; i >= 0 ; i --) {
			System.out.print(ary[i] + " ");
			//spacedPrint(ary[i]);

		}
				
		System.out.println();
		
		for(int i = 1; i <= ary.length ; i += 2) {
			System.out.print(ary[i] + " ");
			//spacedPrint(ary[i]);

		}
		
	}

}
