package mobile;

public class Otab extends Mobile{
//	+Otab()	�Ű����� ���� ������
	Otab(){}
//	+Otab(mobileName:String, batterySize:int,osType:String)	3���� ��� ������ ���� �Է� �޴� ������
	Otab(String mobileName, int batterySize, String osType) {
		
		setMobileName(mobileName);
		setBatterySize(batterySize);
		setOsType(osType);
	}
//	+operate(time:int):void	����� ���� ���͸� ���� ����
//	1�� ��� �� ���͸� 12����

	void operate(int time) {
		for(int i = 0; i < time; i ++) {
			setBatterySize(getBatterySize() - 12);
		}
	}

//	+charge(time:int):void	������ ���� ���͸� ���� ����
//	1�� ���� �� ���͸� 8����
	void charge(int time) {
		for(int i = 0; i < time; i ++) {
			setBatterySize(getBatterySize() + 8);
		}
	}

}
