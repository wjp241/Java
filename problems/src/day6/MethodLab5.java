package day6;
//[ �ǽ� 5 ]
//
//1. Ŭ������ : MethodLab5
//2. �����ؾ� �ϴ� �޼���  
//   �޼���� : powerArray
//   �Ű����� Ÿ�� : int
//   ���ϰ��� Ÿ�� : int[]
//
//   1���� 10������ �ڿ��� �迭�� ����
//   ������ ���Ҹ� �Ű������� ���޵� ����ŭ ����� �����
//   �����Ѵ�.
//
//3. main() �޼��忡�� powerArray �� 3�� ȣ���Ѵ�.
//   
//	int r1[] = powerArray(2);
//	int r2[] = powerArray(3);
//	int r3[] = powerArray(4);
//
//             [ ��� ��� ]
//	2,4,6,8,10,12,14,16,18,20
// 	3,6,9,12,15,18,21,24,27,30
//	4,8,12,16,20,24,28,32,36,40	


public class MethodLab5 {
	
	static int[] powerArray(int prod) {
		
		int[] poweredArr = new int[10];
		
		for(int i = 0; i < 10; i ++) {
			poweredArr[i] = (i + 1)* prod;
			System.out.print(poweredArr[i] + (i != 9 ? ",":"\n" ));
		}
		
		return poweredArr;
	}
	


	public static void main(String[] args) {
		int r1[] = powerArray(2);
		int r2[] = powerArray(3);
		int r3[] = powerArray(4);
		}
	}


