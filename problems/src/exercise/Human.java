package exercise;
//+
//Human �⺻
//������
//+
//Human n ame:String, age :int
//height:int,
//weight :int
//4
//�� �� �� �� �� ���� �� �� �� �� �� ȭ
//�� �� ������
//+
//printInformation()printInformation():String Human
//������ ���� �Ѵ�
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
