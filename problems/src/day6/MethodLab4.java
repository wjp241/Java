package day6;
//[ �ǽ� 4 ]
//
//1. Ŭ������ : MethodLab4
//2. �����ؾ� �ϴ� �޼���  
//   �޼���� : maxNumArray
//   �Ű����� Ÿ�� : int[]
//   ���ϰ��� Ÿ�� : int
//
//   �Ű������� ���޵� �迭�� ���Ұ��� �߿��� ���� ū�� ����
//   
//3. main() �޼��忡�� maxNumArray �� 3�� ȣ���Ѵ�.
//   ���� �迭���� �����Ͽ�
//     �迭 1 : 10, 20, 30
//     �迭 2 : 100, 500, 300, 200, 400
//     �迭 3 : 1, 10, 3, 4, 5, 8, 7, 6, 9, 2
//   
//   ȣ���ϰ� ���ϰ��� ������ ���� ����Ѵ�.
//     ���� ū ���� 30 �Դϴ�.
//     ���� ū ���� 500 �Դϴ�.
//     ���� ū ���� 10 �Դϴ�.


public class MethodLab4 {
	
	static int maxNumArray(int[] intArr) {
		
		int max = Integer.MIN_VALUE;
		
			for(int k=0; k < intArr.length; k++) {
				
				if(intArr[k] > max) {
					max = intArr[k];
				}

			}
		
		return max;
	}
	


	public static void main(String[] args) {
//	     �迭 1 : 10, 20, 30
//	     �迭 2 : 100, 500, 300, 200, 400
//	     �迭 3 : 1, 10, 3, 4, 5, 8, 7, 6, 9, 2
	//   
		
		int[] intArr1 = {10,20,30};
		int[] intArr2 = {100,500,300,200,400};
		int[] intArr3 = {1,10,3,4,5,8,7,6,9,2};
		
		
		int max1 = maxNumArray(intArr1);
		int max2 = maxNumArray(intArr2);
		int max3 = maxNumArray(intArr3);

		int[] maxes = {max1, max2, max3};
		
		String phrase1 = "���� ū����";
		String phrase2 = "�Դϴ�";
		
		for(int max: maxes) {
			System.out.printf("%s %d %s%n", phrase1,  max, phrase2);
		}

		
			
		}
	}


