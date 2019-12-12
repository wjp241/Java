package day7;
import day6.MethodLab3;
//1~12의 난수, 1~4의 난수를 추출하여 각각
//month 변수와 grade 변수에 저장한다.
//month : 월 정보
//(짝수달 : 보너스 달, 홀수달 : 보너스달이 아님)
//grade : 등급(1-4)
//보너스 달이면 
//SalaryExpr(100) 를 가지고 SalaryExpr의 인스턴스를 생성하여 grade 값을 전달하면서 
//getSalary() 를 호출한 결과 값을 화면에 표준 출력한다. 
//(등급 관계없이 보너스 금액은 100 으로 설정한다.) 
//보너스 달이 아니면 
//SalaryExpr() 를 가지고 SalaryExpr의 인스턴스를 생성하여 grade 값을 전달하면서 getSalary() 를 호출한 결과를 화면에 표준 출력한다. 
//- 출력 형식 : “..... 월 ..... 등급의 월급은 ..... 입니다.” 

public class SalaryExam {

	public static void main(String[] args) {
		int month = MethodLab3.getRandom(12);
		int grade =MethodLab3.getRandom(4);
		
		SalaryExpr salaryExpr = month%2 == 0? (new SalaryExpr(100)) : ( new SalaryExpr());
		int salary = salaryExpr.getSalary(grade);
		
		System.out.printf("%d월 %d등급의 월급은 %d 입니다", month, grade, salary);
	}

}
