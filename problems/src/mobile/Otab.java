package mobile;

public class Otab extends Mobile{
//	+Otab()	매개변수 없는 생성자
	Otab(){}
//	+Otab(mobileName:String, batterySize:int,osType:String)	3개의 멤버 변수의 값을 입력 받는 생성자
	Otab(String mobileName, int batterySize, String osType) {
		
		setMobileName(mobileName);
		setBatterySize(batterySize);
		setOsType(osType);
	}
//	+operate(time:int):void	사용을 통해 배터리 감소 구현
//	1분 사용 시 배터리 12감소

	void operate(int time) {
		for(int i = 0; i < time; i ++) {
			setBatterySize(getBatterySize() - 12);
		}
	}

//	+charge(time:int):void	충전을 통한 배터리 증가 구현
//	1분 충전 시 배터리 8증가
	void charge(int time) {
		for(int i = 0; i < time; i ++) {
			setBatterySize(getBatterySize() + 8);
		}
	}

}
