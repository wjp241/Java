package exercise;
//+
//Student n ame:String, age :int
//height:int,
//weight :int ,String
//number, String major
//5
//개 인 스 턴 스 변수 의 값 을 초 기 화
//하 는 생성자
//+
//printInformation()printInformation():String Student
//정보를 리턴 한다
public class Student extends Human {
	String number;
	String major;
	
	public Student(){
		
	}
	
	public Student(String name, int age, int height, int weight, String number, String major) {
			super(name, age, height, weight);
			this.number = number;
			this.major = major;
	}
	
	public String printInformation() {
		return super.printInformation() + number + " "+ major ;
	}
}
