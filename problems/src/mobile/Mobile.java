package mobile;

abstract public class Mobile {
	private String mobileName;
	private int batterySize;
	private String osType;
//	+Mobile()	�Ű����� ���� ������
	Mobile(){
		
	}
//	+Mobile(mobileName:String, batterySize:int,osType:String)	3���� ��� ������ ���� �Է� �޴� ������
	Mobile(String mobileName, int batterySize, String osType) {
		this.mobileName = mobileName;
		this.batterySize = batterySize;
		this.osType = osType;
	}
//	+operate(time:int):void 	abstract �޼���� ����
	abstract void operate(int time) ;
//	+charge(time:int):void	abstract �޼���� ����
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
