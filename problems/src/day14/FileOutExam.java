package day14;

import java.io.FileWriter;
import java.io.IOException;
//Ŭ������ : FileOutExam
//
//������ ���� ������ �����Ͽ� c:/iotest/today.txt ��� ���Ͽ� �����Ѵ�.
// c:/iotest ���丮�� ���翩�θ� äũ�ϰ� �������� ������ ������
//�����մϴ�.  ��� ������ ������ �����ϴ�.
//
//������ 2019�� 12�� 20���Դϴ�.
//������ �ݿ����Դϴ�.
//XXX�� X���Ͽ� �¾���ϴ�.
//
//
//���������� ����Ǹ� 
//ȭ�鿡 �������� �Ϸ�Ǿ����ϴ�.��
//���� �߻���
//ȭ�鿡 "���Ͽ� �����ϴ� ���� ������ �߻��߽��ϴ�."
//�� ����ϴ� ���α׷��� �����Ͽ� �����ϼ���.
import java.util.GregorianCalendar;

public class FileOutExam {

	public static void main(String[] args) throws Exception {

        final String[] DAY_OF_WEEK = {"", "��", "��", "ȭ", "��", "��", "��", "��"};
        GregorianCalendar gc = new GregorianCalendar(1992, 05, 22);
        
        try (FileWriter writer = new FileWriter("c:/iotest/output5.txt", true);){         
            writer.write("������ 2019�� 12�� 20���Դϴ�.\n");
            writer.write("������ �ݿ����Դϴ�.\n");
            writer.write(String.format("%s�� %s���Ͽ� �¾���ϴ�.\n", "�ڿ���", DAY_OF_WEEK[gc.get(GregorianCalendar.DAY_OF_WEEK)]));

            System.out.println("������ �Ϸ�Ǿ����ϴ�");
        } catch (IOException ioe) {
            System.out.println("���Ͽ� �����ϴ� ���� ������ �߻��߽��ϴ�.");
        } 
        
		
	}

}
