package day3;


//1. ForLab2 �̶�� Ŭ������ �����.
//2. ������ ���� ����� ��µǵ��� �����Ѵ�.
//
//    9 : Ȧ��
//    8 : ¦��
//    7 : Ȧ��
//    6 : ¦��
//    5 : Ȧ��
//    4 : ¦��
public class ForLab2 {
	public static void main(String[] args) {
		for(int i = 9; i >= 4; i--) {
//			if(i%2==0) {
//				System.out.println(i + " : ¦��");
//			} else {
//				System.out.println(i + " : Ȧ��");
//			}
		 System.out.println(i + (i % 2 == 0 ? " : ¦��" : " : Ȧ��"));
		}
	
	}
}
