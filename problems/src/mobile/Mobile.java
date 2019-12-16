package mobile;

abstract public class Mobile {
	private String mobileName;
	private int batterySize;
	private String osType;
//	+Mobile()	매개변수 없는 생성자
	Mobile(){
		
	}
//	+Mobile(mobileName:String, batterySize:int,osType:String)	3개의 멤버 변수의 값을 입력 받는 생성자
	Mobile(String mobileName, int batterySize, String osType) {
		this.mobileName = mobileName;
		this.batterySize = batterySize;
		this.osType = osType;
	}
//	+operate(time:int):void 	abstract 메서드로 정의
	abstract void operate(int time) ;
//	+charge(time:int):void	abstract 메서드로 정의
	 abstract  void charge(int charge) ;
	 
	String  getMobileName(){
		 return this.mobileName;
	 }
	
	void setMobileName(String mobileName){
		 this.mobileName = mobileName;
	 }
	 int getBatterySize() {
		 return this.batterySize;
	 }
	 
		void setBatterySize(int batterySize){
			 this.batterySize= batterySize;
		 }

	 String getOsType(){
		 return this.osType;
	 }
	 
	void  setOsType(String osType){
		 this.osType = osType;
	 }
	
	
}
