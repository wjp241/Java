package exercise;
//+
//Human 기본
//생성자
//+
//Human n ame:String, age :int
//height:int,
//weight :int
//4
//개 인 스 턴 스 변수 의 값 을 초 기 화
//하 는 생성자
//+
//printInformation()printInformation():String Human
//정보를 리턴 한다
public class Human {
	String name;
	int age; 
	int height; 
	int weight;
	
	Human(){
		
	}
	Human(String name, int age, int height, int weight) {
			this.name = name;
			this.age = age;
			this.height = height;
			this.weight = weight;
	}
	
	public String printInformation() {
		return  name + " " + age + " " +  height + " "+ weight + " ";
	}
}
