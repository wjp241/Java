package mobile;

public class Ltab extends Mobile {
//	+Ltab()	�Ű����� ���� ������
	Ltab(){}
//	+Ltab(mobileName:String, batterySize:int,osType:String)	3���� ��� ������ ���� �Է� �޴� ������
	Ltab(String mobileName, int batterySize, String osType) {
		setMobileName(mobileName);
		setBatterySize(batterySize);
		setOsType(osType);
	}
//	+operate(time:int):void 	����� ���� ���͸� ���� ����, 
//	1�� ��� �� ���͸� 10����
void operate(int time) {
	for(int i = 0; i < time; i ++) {
		setBatterySize(getBatterySize() - 10);
	}
}

//	+charge(time:int):void	������ ���� ���͸� ���� ����
//	1�� ���� �� ���͸� 10����
//
void charge(int time) {
	for(int i = 0; i < time; i ++) {
		setBatterySize(getBatterySize() + 10);
	}
}
}	
