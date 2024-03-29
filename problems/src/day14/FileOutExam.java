package day14;

import java.io.FileWriter;
import java.io.IOException;
//클래스명 : FileOutExam
//
//다음과 같은 내용을 추출하여 c:/iotest/today.txt 라는 파일에 저장한다.
// c:/iotest 디렉토리의 존재여부를 채크하고 존재하지 않으면 새로이
//생성합니다.  출력 내용은 다음과 같습니다.
//
//오늘은 2019년 12월 20일입니다.
//오늘은 금요일입니다.
//XXX는 X요일에 태어났습니다.
//
//
//정상적으로 수행되면 
//화면에 “저장이 완료되었습니다.”
//예외 발생시
//화면에 "파일에 저장하는 동안 오류가 발생했습니다."
//를 출력하는 프로그램을 구현하여 제출하세요.
import java.util.GregorianCalendar;

public class FileOutExam {

	public static void main(String[] args) throws Exception {

        final String[] DAY_OF_WEEK = {"", "일", "월", "화", "수", "목", "금", "토"};
        GregorianCalendar gc = new GregorianCalendar(1992, 05, 22);
        
        try (FileWriter writer = new FileWriter("c:/iotest/output5.txt", true);){         
            writer.write("오늘은 2019년 12월 20일입니다.\n");
            writer.write("오늘은 금요일입니다.\n");
            writer.write(String.format("%s는 %s요일에 태어났습니다.\n", "박우재", DAY_OF_WEEK[gc.get(GregorianCalendar.DAY_OF_WEEK)]));

            System.out.println("저장이 완료되었습니다");
        } catch (IOException ioe) {
            System.out.println("파일에 저장하는 동안 오류가 발생했습니다.");
        } 
        
		
	}

}
