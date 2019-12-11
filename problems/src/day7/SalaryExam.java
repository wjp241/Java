package day7;
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
		int month = (int)(Math.random() * 12 + 1);
		int grade = (int)(Math.random() * 4 + 1);
		
		SalaryExpr salaryExpr;
		
		if(month %2 == 0) {
			salaryExpr =  new SalaryExpr(100);

		} else {
			salaryExpr = new SalaryExpr();
		}
		
		System.out.printf("%d월 %d등급의 월급은 %d 입니다", month, grade, salaryExpr.getSalary(grade));
	}

}
