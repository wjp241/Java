package day14;

import java.io.*;
public class FileReaderTest {
    public static void main(String args[]) {
       FileReader reader = null;
       try {
           reader = new FileReader("c:/iotest/output2.txt");
           while (true) {
               int data = reader.read();
               if (data == -1)
                   break;
               char ch = (char) data;
               System.out.print(ch);
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



