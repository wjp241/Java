package day3;
//[ �ǽ� 3 ]
//1. ForLab3 �̶�� Ŭ������ �����.
//2. int Ÿ������ evenNum ������ oddNum ������ �����Ѵ�.
//3. 1 ���� 100 ������ �� �߿��� 
//¦���� ���� evenNum �� �����ϰ� 
//Ȧ���� ���� oddNum �� �����Ѵ�.
//4. ���� ����� ������ ���� ����Ѵ�.
//
//1���� 100������ ���ڵ� �߿��� 
//¦���� ���� XXX �̰� 
//Ȧ���� ���� YYY �̴�.
public class ForLab5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int evenNum = 0, oddNum = 0;
		for(int i = 1; i <= 100; i++) {
			if(i%2 == 0) {
				evenNum += i;
			} else {
				oddNum += i;
			}
		}
		System.out.println("¦���� ���� " + evenNum + "�̰�\nȦ���� ����" + oddNum + " �̴�");
	}

}
