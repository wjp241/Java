package day14;
//Ŭ������ : CopyExam
//
//������ sample.txt ������ �а� 
//sample_yyyy_mm_dd.txt ���Ͽ� �״�� ����ϴ� ���α׷���
//������ ���ϴ�. �� ������ append ���� �����Ͽ�
//������ �׽�Ʈ�ϸ� sample.txt ������ ������ 
//sample_yyyy_mm_dd.txt ���Ͽ�  ��� �߰��ǰ� �մϴ�.
//
//
//���������� ����Ǹ� 
//ȭ�鿡 ������ �Ϸ�Ǿ����ϴ�.��
//���� �߻���
//ȭ�鿡 "ó���ϴ� ���� ������ �߻��߽��ϴ�."
//�� ����ϴ� ���α׷��� �����Ͽ� �����ϼ���.

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
	           System.out.println("������ �������� �ʽ��ϴ�.");
	       } catch (IOException ioe) {
	           System.out.println("������ ���� �� �����ϴ�.");
	       } finally {
	          try {
	               reader.close();
	          } catch (Exception e) {
	        	  e.printStackTrace();
	          }
	       }
	}

}
