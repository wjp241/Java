package day4;

public class ArrayLab3 {

//[ �ǽ� 3 ]
//1. ArrayLab3 ��� Ŭ������ �ϳ� �����.


	public static void main(String[] args) {
		
		char[] java = {'J','a','v','a'};
		//2. 'J', 'a', 'v', 'a' ��� ���ҵ�� �����Ǵ� char Ÿ���� �迭��
	//   �����.

		String resStr = "���� ���:\n\n��ȯ�� �迭: ";

		for(int i = 0; i < java.length; i++) {
			//3. �� ���ҵ��� ������ �빮�ڴ� �ҹ��ڷ� �ҹ��ڴ� �빮�ڷ� 
//		    ��ȯ�Ѵ�.

			if((int)java[i] < 97) {
				
//				java[i] = (char)(java[i] + 32);
				java[i] +=  32;


			} else {
				
//				java[i] = (char)(java[i] - 32);
				java[i] -= 32;

				
			}
			
			resStr += java[i] + (i != java.length -1 ? ",":"");

		}
		//4. ���� ��� :
		//
//		    ��ȯ�� �迭 : j,A,V,A
		System.out.print(resStr);
		
	}

}
