package day6;
//[ �ǽ� 1 ]
//1. Ŭ������ : MethodLab1
//
//2. �����ؾ� �ϴ� �߰� �޼��� (static �ٿ���)
//   �Ű����� : char Ÿ�� 1��, int Ÿ�� 1 �� 
//   ���ϰ� : ����
//   �޼���� : ���Ƿ�
//   ��� : ù��° �ƱԸ�Ʈ�� ���޵� ���ڸ� 
//            �ι�° �ƱԸ�Ʈ�� ���޵� ������ ������ŭ 
//            �� �࿡ ����Ѵ�.
//3. main() �޼��忡���� ������ ���� �ƱԸ�Ʈ�� �����ϸ鼭
//    ���� ������ �޼��带 ȣ���Ѵ�.
//
//     xxxx('@', 3)
//     xxxx('%', 4)
//     xxxx('A', 5)
//     xxxx('��', 3)
//    ���
//         @@@
//         %%%%
//         AAAAA  
//         ������
public class MethodLab1 {
	static void method(char someChar, int someInt) {
		for(int i = 0; i < someInt; i++) {
			System.out.print(someChar );
		}
		System.out.println();
	}
	public static void main(String[] args) {
		method('h', 5);
		method('%', 4);
		method('A', 5);
		method('��', 3);
	}

}
