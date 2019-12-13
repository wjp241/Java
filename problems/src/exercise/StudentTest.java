package exercise;

public class StudentTest {

	public static void main(String[] args) {
		Student arrays [] = new Student[3];
		arrays[0] = new Student("홍길동", 20, 171, 81, "201101", "영문") ;
		arrays[1] = new Student("고길동", 21, 183, 72, "201102", "건축") ;
		arrays[2] = new Student("박길동", 22, 175, 65, "201103", "컴공") ;

		// 배열에 있는 객체 정보를 printInformation()을 호출하여 모두 출력 한다.
		for(Student student:arrays) {
			System.out.println(student.printInformation()); 
		}

	}

}


//실행 결과
//홍길동 20 171 81 201101 영문
//고길동 21 183 72 201102 건축
//박길동 22 175 65 201103 컴공