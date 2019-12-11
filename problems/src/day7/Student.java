package day7;
public class Student {
	String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	int getTotal(){
		return kor + eng + math;
	}
	
	float getAverage() {
		return Float.parseFloat(String.format("%.1f", this.getTotal()/3f));
	}
}
