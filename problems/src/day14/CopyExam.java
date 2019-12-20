package day14;
//클래스명 : CopyExam
//
//제공된 sample.txt 파일을 읽고 
//sample_yyyy_mm_dd.txt 파일에 그대로 출력하는 프로그램을
//구현해 봅니다. 이 파일은 append 모드로 오픈하여
//여러번 테스트하면 sample.txt 파일의 내용이 
//sample_yyyy_mm_dd.txt 파일에  계속 추가되게 합니다.
//
//
//정상적으로 수행되면 
//화면에 “저장 완료되었습니다.”
//예외 발생시
//화면에 "처리하는 동안 오류가 발생했습니다."
//를 출력하는 프로그램을 구현하여 제출하세요.

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.GregorianCalendar;

public class CopyExam {

	public static void main(String[] args) throws Exception {
		 FileReader reader = null;
	     BufferedReader br = null;
	   
	     GregorianCalendar now = new GregorianCalendar();
	     String fileFormat = String.format("c:/iotest/sample_%tY_%tm_%td.txt",
	      		   now, 
	      		   now, 
	      		   now);
	     
	       try(FileWriter writer = new FileWriter(fileFormat, true); ){
	           reader = new FileReader("sample.txt");
	           br = new BufferedReader(reader);
	           while (true) {
	               String data = br.readLine();
	               if (data == null)
	                   break;       
	               System.out.println(data);

	               
	               writer.write(data + "\n");
	         
	           }
	       } catch (FileNotFoundException fnfe) {
	           System.out.println("파일이 존재하지 않습니다.");
	       } catch (IOException ioe) {
	           System.out.println("파일을 읽을 수 없습니다.");
	       } finally {
	          try {
	               reader.close();
	          } catch (Exception e) {
	        	  e.printStackTrace();
	          }
	       }
	}

}
